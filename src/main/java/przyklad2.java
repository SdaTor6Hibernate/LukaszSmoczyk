import model.Address;
import model.Order;
import model.Product;
import model.User;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {

    public static void main(String[] args) {

//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Order order = session.find(Order.class, 2);
//        session.close();
//        System.out.println(order.toString());
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.find(Product.class, 2);
        session.close();
        System.out.println(product.toString());
    }
}
