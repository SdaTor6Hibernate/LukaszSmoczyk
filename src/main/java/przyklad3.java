import DAO.GenericDao;
import model.Address;
import model.User;
import org.hibernate.mapping.Array;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class przyklad3 {

    public static void main(String[] args) {
        GenericDao<Address> addressGenericDao = new GenericDao<>(Address.class);
        GenericDao<User> userGenericDao = new GenericDao<>(User.class);
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setFirstName("Harry");
        user1.setLastName("Potter");
        user1.setPassword("buraki");
        user1.setEmail("kochamvoldemorta123@horkruks.uk");
        user1.setBirthDate(LocalDateTime.now());
        Address address1 = addressGenericDao.selectById(3);
        user1.setAddress(address1);


        User user2 = new User();
        user2.setFirstName("Johnny");
        user2.setLastName("Bravo");
        user2.setPassword("majtki");
        user2.setEmail("miesnie@duze.com");
        user2.setBirthDate(LocalDateTime.now());
        Address address2 = addressGenericDao.selectById(5);
        user2.setAddress(address2);

        User user3 = new User();
        user3.setFirstName("Kame");
        user3.setLastName("Hame");
        user3.setPassword("Ha");
        user3.setEmail("goku@ssj3.jp");
        user3.setBirthDate(LocalDateTime.now());
        Address address3 = addressGenericDao.selectById(7);
        user3.setAddress(address3);

        users.add(user1);
        users.add(user2);
        users.add(user3);

       users.forEach(userGenericDao::insert);
//        users.forEach(user -> {
//            user.setLastName(user.getLastName() + " - Zakażony");
//            userGenericDao.update(user);
//        });

    }
}
