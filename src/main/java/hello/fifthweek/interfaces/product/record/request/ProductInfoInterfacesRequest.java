package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductInfoDomainRequest;

public record ProductInfoInterfacesRequest(long productId, long productOptionId) {


    public ProductInfoDomainRequest toDomain() {
        return new ProductInfoDomainRequest(productId, productOptionId);
    }
}
