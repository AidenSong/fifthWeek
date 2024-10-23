package hello.fifthweek.interfaces.product.record.response;




public record ProductInfoInterfacesResponse(
        long productId,
        String productName,
        String productOption,
        int productQuantity
    ) { }
