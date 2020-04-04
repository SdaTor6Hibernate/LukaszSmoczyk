package DAO;

//       criteriaQuery.select(root).where(cb.gt(root.get("itemPrice"), 1000));
//       criteriaQuery.select(root).where(cb.lt(root.get("itemPrice"), 1000));
//       criteriaQuery.select(root).where(cb.like(root.get("itemName"), "%chair%"));
//       criteriaQuery.select(root).where(cb.between(root.get("itemPrice"), 100, 200));
//       criteriaQuery.select(root).where(cb.isNull(root.get("itemDescription")));
//       criteriaQuery.select(root).where(cb.isNotNull(root.get("itemDescription")));

//Dopisz kolejne implementacje metod do klasy UserCriteriaDao i wyświetl ich rezultaty
// 1. findAllBornBetween()
// 2. findByEmail()
// 3. findAllByCityName(); tak aby obiekty user zawierały jednocześnie informacje o adresie
// 4. findAllByCountryAlias(); tak aby obiekty user zawierały informacje zawarte w tabeli user
// 5. TRUDNE findAllWhoBoughtProduct();

import model.User;
import model.User_;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.List;

public class UserCriteriaDao {

    private Session session;
    private CriteriaBuilder criteriaBuilder;
    private CriteriaQuery<User> criteriaQuery;
    private Root<User> user;

    private void configureForm() {
        session = HibernateUtil.getSessionFactory().openSession();
        criteriaBuilder = session.getCriteriaBuilder();
        criteriaQuery = criteriaBuilder.createQuery(User.class);
        user = criteriaQuery.from(User.class);

    }

    public List<User> findAllBornBetween(LocalDateTime date1, LocalDateTime date2){
        configureForm();
        criteriaQuery.select(user).where(criteriaBuilder.between(user.get(User_.BIRTH_DATE), date1, date2));
        TypedQuery<User> query = session.createQuery(criteriaQuery);
        List<User> users = query.getResultList();
        session.close();
        return users;
    }


}
