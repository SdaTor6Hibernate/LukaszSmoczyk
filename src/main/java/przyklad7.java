
import model.Address;
import model.Address_;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class przyklad7 {

        public static void main(String[] args) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Address> query = builder.createQuery(Address.class);
            Root<Address> addressRoot = query.from(Address.class);
            addressRoot.fetch("country");
            query.select(addressRoot).where(builder.like(addressRoot.get(Address_.city),"Lyon"));
            TypedQuery<Address> q = session.createQuery(query);
            List<Address> addressList = q.getResultList();
            session.close();
            addressList.forEach(address -> System.out.println(address.getCountry().toString()));
        }
    }
