package hello.fifthweek.domain.product.record.response;

public record ProductIndeAmountDomainResponse(
        long productId,
        String productName,
        String productOption,
        int productQuantity
) {

}
