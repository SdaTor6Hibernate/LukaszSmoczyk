package model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data

public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID")
    private int countryId;
    @Column(name = "CO_NAME")
    private String name;
    @Column(name = "CO_ALIAS")
    private String alias;
}
