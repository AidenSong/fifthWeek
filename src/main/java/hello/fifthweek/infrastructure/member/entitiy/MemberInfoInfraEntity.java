package hello.fifthweek.infrastructure.member.entitiy;


import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
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
public class MemberInfoInfraEntity {

    @Id
    private long MEMBER_ID;
    @Column(name = "MEMBER_BALANCE")
    private int MEMBER_BALANCE;


    public MemberInfoDomainResponse toDomain() {
        return new MemberInfoDomainResponse(MEMBER_ID, MEMBER_BALANCE);
    }
}
