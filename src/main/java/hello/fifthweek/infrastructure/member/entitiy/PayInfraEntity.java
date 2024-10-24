package hello.fifthweek.infrastructure.member.entitiy;


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
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "ORDER_ID")
    private long orderId;


}
