package hello.fifthweek.domain.product.record.request;


import hello.fifthweek.infrastructure.product.entity.ProductRegistInfraEntity;



public record ProductRegistDomainRequest(long productId, String productName) {


    public ProductRegistInfraEntity toEntity() {
        ProductRegistInfraEntity entity = new ProductRegistInfraEntity();
        entity.setProductId(productId);
        entity.setProductName(productName);

        return entity;
    }
}
