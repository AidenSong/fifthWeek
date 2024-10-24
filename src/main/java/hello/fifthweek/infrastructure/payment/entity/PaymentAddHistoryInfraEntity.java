package hello.fifthweek.infrastructure.payment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PAYMENT_HISTORY")
public class PaymentAddHistoryInfraEntity {


    @Id
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "PAYMENT_AMOUNT")
    private int paymentAmount;
}
