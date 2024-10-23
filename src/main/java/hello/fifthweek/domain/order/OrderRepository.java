package hello.fifthweek.domain.order;


import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fifthweek.infrastructure.order.entity.OrderAddHistoryInfraEntity;
import hello.fifthweek.infrastructure.order.entity.OrderInfoInfraEntity;

public interface OrderRepository {

    OrderInfoDomainResponse orderInfo(OrderInfoInfraEntity orderInfoInfraEntity);

    boolean orderAddHistory(OrderAddHistoryInfraEntity orderAddHistoryInfraEntity);
}
