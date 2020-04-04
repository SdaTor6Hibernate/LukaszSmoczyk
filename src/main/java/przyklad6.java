import DAO.GenericDao;
import model.Product;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad6 {

    public static void main(String[] args) {
        GenericDao<Product> genericDao = new GenericDao<>(Product.class);
        Product product = genericDao.selectById(1);
        System.out.println("debug");

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.update(product);
        Hibernate.initialize(product.getCategory());
        System.out.println("debug");
        session.close();
    }
}
