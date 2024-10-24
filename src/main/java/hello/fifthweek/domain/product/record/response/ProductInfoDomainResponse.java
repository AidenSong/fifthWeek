package hello.fifthweek.domain.product.record.response;


import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;

public record ProductInfoDomainResponse(
        long productId,
        String productName,
        long productOptionId,
        String productOptionName,
        int productQuantity,
        int productPrice
    ) {

    public ProductInfoInterfacesResponse toInterfaces() {
        return new ProductInfoInterfacesResponse(productId, productName,productOptionId, productOptionName, productQuantity, productPrice);
    }
}
