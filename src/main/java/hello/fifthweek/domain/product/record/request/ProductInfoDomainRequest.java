package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductInfoInfraEntity;

public record ProductInfoDomainRequest(long productId, long productOptionId) {


    public ProductInfoInfraEntity toEntity() {
        ProductInfoInfraEntity entity = new ProductInfoInfraEntity();
        entity.setProductId(productId);
        entity.setProductOptionId(productOptionId);

        return entity;
    }
}
