package hello.fifthweek.infrastructure.member.entitiy;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_INFO")
public class UpdateMemberBalanceInfraEntity {


    @Id
    @Column(name = "MEMBER_ID")
    private long memberId;

    @Column(name = "MEMBER_BALANCE")
    private int memberBalance;
}
