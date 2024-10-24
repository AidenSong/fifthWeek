package hello.fifthweek.interfaces.product.record.request;


import hello.fifthweek.domain.product.record.request.ProductRegistDomainRequest;

public record ProductRegistInterfacesRequest(long productId, String productName) {


    public ProductRegistDomainRequest toDomain() {
        return new ProductRegistDomainRequest(productId, productName);
    }
}
