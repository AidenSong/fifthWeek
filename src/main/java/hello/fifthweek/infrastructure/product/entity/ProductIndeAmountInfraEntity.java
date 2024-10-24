package hello.fifthweek.infrastructure.product.entity;


import hello.fifthweek.domain.product.record.response.ProductIndeAmountDomainResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductIndeAmountInfraEntity {

    @Id
    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_OPTION_ID")
    private long productOptionId;

    @Column(name = "PRODUCT_QUANTITY")
    private int productQuantity;


    public ProductIndeAmountDomainResponse toDomain() {
        return new ProductIndeAmountDomainResponse(productId, productOptionId, productQuantity);
    }
}
