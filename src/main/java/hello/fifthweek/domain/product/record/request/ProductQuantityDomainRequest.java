package hello.fifthweek.domain.product.record.request;


import hello.fifthweek.infrastructure.product.entity.ProductQuantityInfraEntity;

public record ProductQuantityDomainRequest(long productId, int productQuantity) {


    public ProductQuantityInfraEntity toEntity() {
        ProductQuantityInfraEntity entity = new ProductQuantityInfraEntity();
        entity.setProductId(productId);
        entity.setProductQuantity(productQuantity);

        return entity;
    }
}
