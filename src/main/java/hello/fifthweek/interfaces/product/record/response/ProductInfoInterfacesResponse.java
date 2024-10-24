package hello.fifthweek.interfaces.product.record.response;




public record ProductInfoInterfacesResponse(
        long productId,
        String productName,
        long productOptionId,
        String productOptionName,
        int productQuantity,
        int productPrice
    ) { }
