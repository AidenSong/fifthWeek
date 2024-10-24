package hello.fifthweek.domain.product.record.request;


import hello.fifthweek.infrastructure.product.entity.ProductQuantityInfraEntity;

public record ProductQuantityDomainRequest(long productId, long productOptionId) {


    public ProductQuantityInfraEntity toEntity() {
        ProductQuantityInfraEntity entity = new ProductQuantityInfraEntity();
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);

        return entity;
    }
}
