package hello.fifthweek.infrastructure.payment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PayInfraEntity {

    @Id
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "PRODUCT_ID_LIST")
    private String productIdList;

    @Column(name = "PRODUCT_OPTION_ID_LIST")
    private String productOptionIdList;

    @Column(name = "QUANTITY_LIST")
    private String quantityList;

}
