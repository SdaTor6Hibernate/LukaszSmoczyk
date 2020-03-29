package DAO;

public class Main {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        userDAO.selectUserById(2);
        System.out.println(userDAO.selectUserById(2).toString());
    }
}
