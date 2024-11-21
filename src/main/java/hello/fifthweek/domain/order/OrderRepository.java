package hello.fifthweek.domain.order;


import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fifthweek.infrastructure.order.entity.OrderAddHistoryInfraEntity;

public interface OrderRepository {

    OrderInfoDomainResponse orderInfo(long orderId);

    boolean orderAddHistory(OrderAddHistoryInfraEntity orderAddHistoryInfraEntity);
}
