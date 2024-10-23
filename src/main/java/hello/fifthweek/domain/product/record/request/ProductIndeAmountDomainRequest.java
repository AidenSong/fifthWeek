package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductIndeAmountInfraEntity;
import lombok.Setter;

public record ProductIndeAmountDomainRequest(
        long productId,
        String productOption,
        int indeAmount
    ) {


    public ProductIndeAmountInfraEntity toEntity() {
        ProductIndeAmountInfraEntity entity = new ProductIndeAmountInfraEntity();
        entity.setProductId(productId);
        entity.setProductOption(productOption);
        entity.setProductQuantity(indeAmount);

        return entity;
    }
}
