package hello.fifthweek.interfaces.member.record.request;


import hello.fifthweek.domain.product.record.request.ProductQuantityDomainRequest;

public record ProductQuantityInterfacesRequest(long productId, long productOptionId) {


    public ProductQuantityDomainRequest toDomain() {
        return new ProductQuantityDomainRequest(productId, productOptionId);
    }
}
