package hello.fifthweek.infrastructure.order.entity;


import hello.fifthweek.domain.order.record.response.OrderInfoDomainResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ORDER_INFO")
public class OrderInfoInfraEntity {

    @Id
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "PRODUCT_LIST")
    private String productList;

    @Column(name = "PRODUCT_OPTION_LIST")
    private String productOptionList;

    @Column(name = "QUANTITY_LIST")
    private String quantityList;


    public OrderInfoDomainResponse toDomain() {
        return new OrderInfoDomainResponse(orderId, memberId, productList, productOptionList, quantityList);
    }
}
