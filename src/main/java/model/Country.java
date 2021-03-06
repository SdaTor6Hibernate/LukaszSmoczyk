package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Country implements ModelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID")
    private int id;
    @Column(name = "CO_NAME")
    private String name;
    @Column(name = "CO_ALIAS")
    private String alias;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return ""+id;
    }

}
