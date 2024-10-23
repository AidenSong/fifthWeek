package hello.fifthweek.domain.product.record.request;


import hello.fifthweek.infrastructure.product.entity.ProductRegistEntity;



public record ProductRegistDomainRequest(long productId, String productName) {


    public ProductRegistEntity toEntity() {
        ProductRegistEntity entity = new ProductRegistEntity();
        entity.setProductId(productId);
        entity.setProductName(productName);

        return entity;
    }
}
