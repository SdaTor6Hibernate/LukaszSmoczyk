import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {

    public static void main(String[] args) {

    useDelete();
    }

    public static void usePersist(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Indie");
        newCountry.setAlias("IN");
        System.out.println("Przed persist");
        session.persist(newCountry);
        System.out.println("Po persist");
        session.flush();
        System.out.println("Po flush");
        session.beginTransaction().commit();
        session.close();
    }

    public static void useMerge(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Spain");
        newCountry.setAlias("ES");
        System.out.println("before merge");
        session.merge(newCountry);
        System.out.println("after merge");
        session.flush();
        session.close();
        System.out.println("after close");
    }

    //Różnica między merge a update
    public static void useUpdate() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Country country = session.get(Country.class, 11);
        session.close();
        country.setName("ChinaChanged");
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Country country2 = session2.get(Country.class, 11);
        System.out.println("Po get");
        session2.beginTransaction();
        session2.update(country); //TO NIE ZADZIAŁA
        session2.merge(country); //TO ZADZIAŁA
        System.out.println("Po Merge/Update");
        session2.getTransaction().commit();
        session2.close();
    }

    public static void useDelete(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country countryToBeDeleted = new Country();
        countryToBeDeleted.setId(90);
        if (session.contains(countryToBeDeleted)) {
            session.delete(countryToBeDeleted);
        }
        else {
            System.out.println("Country does not exist");
        }
        session.flush();
        session.close();

    }
}
