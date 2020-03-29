package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAT_ID")
    private int catId;
    @Column(name = "CAT_NAME")
    private String name;
}
