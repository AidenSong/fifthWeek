package hello.fifthweek.domain.product.record.request;

import hello.fifthweek.infrastructure.product.entity.ProductAddHistoryInfraEntity;

import java.time.LocalDateTime;

public record ProductAddHistoryDomainRequest(
        long productId,
        int indeAmount,
        int indeQuantity,
        LocalDateTime createdAt
) {


    public ProductAddHistoryInfraEntity toEntity() {
        ProductAddHistoryInfraEntity entity = new ProductAddHistoryInfraEntity();
        entity.setProducId(productId);
        entity.setIndeAmount(indeAmount);
        entity.setIndeQuantity(indeQuantity);
        entity.setCreateAt(createdAt);

        return entity;
    }
}
