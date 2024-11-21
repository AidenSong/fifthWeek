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
@Table(name = "PRODUCT_INFO")
public class ProductRegistInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
}
