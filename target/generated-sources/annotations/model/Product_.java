package model;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, BigDecimal> price;
	public static volatile SingularAttribute<Product, String> description;
	public static volatile SetAttribute<Product, Order> orders;
	public static volatile SingularAttribute<Product, Integer> id;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile SingularAttribute<Product, String> productName;

	public static final String PRICE = "price";
	public static final String DESCRIPTION = "description";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String CATEGORY = "category";
	public static final String PRODUCT_NAME = "productName";

}

