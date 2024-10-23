package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductOptionRegistDomainRequest;

public record ProductOptionRegistInterfacesRequest(
        long productId,
        String productOption,
        int productQuantity
    ) {

    public ProductOptionRegistDomainRequest toDomain() {
        return new ProductOptionRegistDomainRequest(productId, productOption, productQuantity);
    }
}
