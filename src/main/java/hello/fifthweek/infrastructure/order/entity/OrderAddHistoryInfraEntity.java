package hello.fifthweek.infrastructure.order.entity;


import hello.fifthweek.domain.order.record.response.OrderAddHistoryDomainResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderAddHistoryInfraEntity {

    @Id
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "PRODUCT_ID")
    private long productId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_OPTION_ID")
    private long productOptionId;

    @Column(name = "PRODUCT_OPTION_NAME")
    private String productOptionName;

    @Column(name = "QUANTITY")
    private int quantity;


    public OrderAddHistoryDomainResponse toDomain() {
        return new OrderAddHistoryDomainResponse(orderId, memberId, productId, productName, productOptionId, productOptionName, quantity);
    }
}
