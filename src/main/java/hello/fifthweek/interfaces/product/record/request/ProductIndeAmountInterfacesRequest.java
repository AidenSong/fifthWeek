package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductIndeAmountDomainRequest;

public record ProductIndeAmountInterfacesRequest(
        long productId,
        String productOption,
        int indeAmount
    ) {

    public ProductIndeAmountDomainRequest toDomain() {
        return new ProductIndeAmountDomainRequest(productId, productOption, indeAmount);
    }
}
