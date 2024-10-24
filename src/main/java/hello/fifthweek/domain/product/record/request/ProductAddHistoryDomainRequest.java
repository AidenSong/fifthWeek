package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductAddHistoryInfraEntity;

import java.time.LocalDateTime;

public record ProductAddHistoryDomainRequest(
        long productId,
        long productOptionId,
        int indeAmount,
        int totalQuantity,
        LocalDateTime createdAt
) {


    public ProductAddHistoryInfraEntity toEntity() {
        ProductAddHistoryInfraEntity entity = new ProductAddHistoryInfraEntity();
        entity.setProducId(productId);
        entity.setProductOptionId(productOptionId);
        entity.setIndeAmount(indeAmount);
        entity.setTotalQuantity(totalQuantity);
        entity.setCreateAt(createdAt);

        return entity;
    }
}
