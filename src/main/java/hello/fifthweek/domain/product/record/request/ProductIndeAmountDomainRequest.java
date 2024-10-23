package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductIndeAmountInfraEntity;

public record ProductIndeAmountDomainRequest(
        long productId,
        String productOption
    ) {


    public ProductIndeAmountInfraEntity toEntity() {
        ProductIndeAmountInfraEntity entity = new ProductIndeAmountInfraEntity();
        entity.setProductId(productId);
        entity.setProductOption(productOption);

        return entity;
    }
}
