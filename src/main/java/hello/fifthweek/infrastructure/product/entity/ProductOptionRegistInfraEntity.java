package hello.fifthweek.infrastructure.product.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_OPTION_INFO")
public class ProductOptionRegistInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_OPTION_ID")
    private long productOptionId;

    @Column(name = "PRODUCT_OPTION_NAME")
    private String productOptionName;

    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;

    @Column(name = "PRODUCT_PRICE")
    private int productPrice;
}
