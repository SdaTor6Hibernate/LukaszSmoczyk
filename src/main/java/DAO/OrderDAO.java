package DAO;

//Utwórz klasę OrderDao, niech ta klasa dziedziczy po klasie GenericDao - stwórz odpowiedni kontruktor aby klasa mogła działać.
//napisz metody
// 1. findByDate()
// 2. findBeforeDate()
// 3. findAfterDate() - zastosuj NativeQuery dla odmiany
// 4. findAllContainingProduct()
// 5. findByUser()
// 6. findByPriceLowerThan()
// Zastosuj TypedQuery następnie zaprezentuj wyniki działania query w klasie main za pomocą System.out.println )


import model.Order;
import model.Product;
import model.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.time.LocalDateTime;
import java.util.List;

public class OrderDAO extends GenericDao<Order> {
    public OrderDAO() {
        super(Order.class);
    }

    private Session session;

    void openSession(){
        session = HibernateUtil.getSessionFactory().openSession();
    }

    public List<Order> findByDate(LocalDateTime localDateTime){
        openSession();
        Query query = session.createQuery("Select o from Order o where o.orderDate = :date").setParameter("date", localDateTime);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }
    public List<Order> beforeDate(LocalDateTime localDateTime){
        openSession();
        Query query = session.createQuery("Select o from Order o where o.orderDate < :date").setParameter("date", localDateTime);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }
    public List<Order> findAfterDate(LocalDateTime localDateTime){
        openSession();
        Query query = session.createNativeQuery("Select * from `order` where ORD_DATE > :date", Order.class).setParameter("date", localDateTime);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }

    public List<Order> findAllContainingProduct(Product product){
        openSession();
        Query query = session.createQuery("Select o from Order o join fetch o.products p where p = :product").setParameter("product", product);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }

    public List<Order> findByUser(User user){
        openSession();
        Query query = session.createQuery("Select o from Order o join fetch o.user u where u = :user").setParameter("user", user);
        List<Order> orders = query.getResultList();
        session.close();
        return orders;
    }
}
