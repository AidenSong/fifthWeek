package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductOptionRegistInfraEntity;

public record ProductOptionRegistDomainRequest(
        long productId,
        long productOptionId,
        String productOptionName,
        int productQuantity
    ) {

    public ProductOptionRegistInfraEntity toEntity() {
        ProductOptionRegistInfraEntity entity = new ProductOptionRegistInfraEntity();
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);
        entity.setProductOptionName(productOptionName);
        entity.setProductQuantity(productQuantity);

        return entity;
    }
}
