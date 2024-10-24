package hello.fifthweek.domain.product.record.response;

public record ProductIndeAmountDomainResponse(
        long productId,
        long productOptionId,
        int productQuantity
) { }
