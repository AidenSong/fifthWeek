package hello.fifthweek.infrastructure.product.entity;


import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductInfoInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_OPTION_ID")
    private long productOptionId;

    @Column(name = "PRODUCT_OPTION_NAME")
    private String productOptionName;

    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;

    @Column(name = "PRODUCT_PRICE")
    private int productPrice;


    public ProductInfoDomainResponse toDomain() {
        return new ProductInfoDomainResponse(productId, productName, productOptionId, productOptionName, productQuantity, productPrice);
    }
}
