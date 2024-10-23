package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;

public record ProductOptionRegistDomainRequest(
        long productId,
        String productOption,
        int productQuantity
    ) {

    public ProductOptionRegistInfraEntity toEntity() {
        ProductOptionRegistInfraEntity entity = new ProductOptionRegistInfraEntity();
        entity.setProductId(productId);
        entity.setProductOption(productOption);
        entity.setProductQuantity(productQuantity);

        return entity;
    }
}
