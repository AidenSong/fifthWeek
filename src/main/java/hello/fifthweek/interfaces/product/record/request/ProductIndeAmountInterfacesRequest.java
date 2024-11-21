package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductIndeAmountDomainRequest;

public record ProductIndeAmountInterfacesRequest(
        long productId,
        long productOptionId,
        int indeAmount
    ) {

    public ProductIndeAmountDomainRequest toDomain() {
        return new ProductIndeAmountDomainRequest(productId, productOptionId, indeAmount);
    }
}
