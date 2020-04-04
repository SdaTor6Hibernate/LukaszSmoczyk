package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static volatile SingularAttribute<Address, String> apartmentNo;
	public static volatile SingularAttribute<Address, Country> country;
	public static volatile SingularAttribute<Address, String> buildingNo;
	public static volatile SingularAttribute<Address, String> city;
	public static volatile SingularAttribute<Address, String> street;
	public static volatile SingularAttribute<Address, String> postalCode;
	public static volatile SingularAttribute<Address, Integer> id;

	public static final String APARTMENT_NO = "apartmentNo";
	public static final String COUNTRY = "country";
	public static final String BUILDING_NO = "buildingNo";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String POSTAL_CODE = "postalCode";
	public static final String ID = "id";

}

