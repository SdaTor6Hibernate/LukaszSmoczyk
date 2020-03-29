package model;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private int productId;
    @Column(name = "PRO_NAME")
    private String productName;
    @Column(name = "PRO_PRICE")
    private BigDecimal price;
    @Column(name = "PRO_DESCRIPTION")
    private String description;
    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "PRO_CAT_ID", referencedColumnName = "CAT_ID")
    private Category category;


}
