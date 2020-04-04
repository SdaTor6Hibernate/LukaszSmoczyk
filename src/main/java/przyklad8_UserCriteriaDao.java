import DAO.UserCriteriaDao;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

public class przyklad8_UserCriteriaDao {

    public static void main(String[] args) {

        UserCriteriaDao userCriteriaDao = new UserCriteriaDao();

        List<User> users = userCriteriaDao.findAllBornBetween(LocalDateTime)
    }
}
