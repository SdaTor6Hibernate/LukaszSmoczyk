package DAO;

import model.Address;

import javax.persistence.GeneratedValue;

public class MainGeneric {
    public static void main(String[] args) {
        GenericDao<Address> addressGenericDao = new GenericDao<>(Address.class);
        System.out.println(addressGenericDao.selectById(2).toString());
    }
}
