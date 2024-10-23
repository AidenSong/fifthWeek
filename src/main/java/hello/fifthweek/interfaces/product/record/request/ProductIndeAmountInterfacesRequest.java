package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductIndeAmountDomainRequest;

public record ProductIndeAmountInterfacesRequest(
        long productId,
        String productOption
    ) {

    public ProductIndeAmountDomainRequest toDomain() {
        return new ProductIndeAmountDomainRequest(productId, productOption);
    }
}
