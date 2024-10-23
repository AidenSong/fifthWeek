package hello.fifthweek.infrastructure.product.entity;


import hello.fifthweek.domain.product.record.response.ProductInfoDomainResponse;
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
public class ProductInfoInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_OPTION")
    private String productOption;

    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;


    public ProductInfoDomainResponse toDomain() {
        return new ProductInfoDomainResponse(productId, productName, productOption, productQuantity);
    }
}
