package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private int usrId;
    @Column(name = "USR_FIRSTNAME")
    private String firstName;
    @Column(name = "USR_LASTNAME")
    private String lastName;
    @Column(name = "USR_PASSWORD")
    private String password;
    @Column(name = "USR_EMAIL")
    private String email;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "USR_ADD_ID", referencedColumnName = "ADD_ID")
    private Address address;
    @Column(name = "USR_BIRTH_DATE")
    private LocalDateTime birthDate;
}
