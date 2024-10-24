package hello.fifthweek.interfaces.product.record.request;

import hello.fifthweek.domain.product.record.request.ProductOptionRegistDomainRequest;

public record ProductOptionRegistInterfacesRequest(
        long productId,
        long productOptionId,
        String productOptionName,
        int productQuantity
    ) {

    public ProductOptionRegistDomainRequest toDomain() {
        return new ProductOptionRegistDomainRequest(productId,productOptionId, productOptionName, productQuantity);
    }
}
