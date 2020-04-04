import DAO.GenericDao;
import DAO.OrderDAO;
import model.Order;
import model.Product;

import java.time.LocalDateTime;
import java.util.List;

public class przyklad5 {

    public static void main(String[] args) {

        OrderDAO orderDAO = new OrderDAO();

//        List<Order> orders = orderDAO.findByDate(LocalDateTime.of(2020,2, 29, 15, 35, 05));
//        orders.forEach(order -> System.out.println(order.toString()));

//        List<Order> ordersBeforeDate = orderDAO.findByDate(LocalDateTime.of(2020,3, 29, 15, 35, 05));
//        ordersBeforeDate.forEach(order -> System.out.println(order.toString()));

//        List<Order> ordersAfterDate = orderDAO.findByDate(LocalDateTime.of(2020,2, 29, 15, 35, 05));
//        ordersAfterDate.forEach(order -> System.out.println(order.toString()));

        GenericDao<Product> productDao = new GenericDao<>(Product.class);
        Product product = productDao.selectById(2);
        List<Order> orders = orderDAO.findAllContainingProduct(product);
        orders.forEach(order -> System.out.println(order.toString()));
    }

}
