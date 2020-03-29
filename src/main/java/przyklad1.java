import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad1 {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Country country = session.find(Country.class, 1);
        session.close();
        System.out.println(country.toString());
    }
}
