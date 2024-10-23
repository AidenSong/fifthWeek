package hello.fifthweek.domain.product.record.response;


import hello.fifthweek.interfaces.product.record.response.ProductInfoInterfacesResponse;

public record ProductInfoDomainResponse(
        long productId,
        String productName,
        String productOption,
        int productQuantity
    ) {

    public ProductInfoInterfacesResponse toInterfaces() {
        return new ProductInfoInterfacesResponse(productId, productName, productOption, productQuantity);
    }
}
