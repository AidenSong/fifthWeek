package hello.fifthweek.interfaces.member.record.request;


import hello.fifthweek.domain.product.record.request.ProductQuantityDomainRequest;

public record ProductQuantityInterfacesRequest(long productId, String productOption) {


    public ProductQuantityDomainRequest toDomain() {
        return new ProductQuantityDomainRequest(productId, productOption);
    }
}
