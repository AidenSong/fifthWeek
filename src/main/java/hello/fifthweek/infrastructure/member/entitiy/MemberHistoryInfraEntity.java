package hello.fifthweek.infrastructure.member.entitiy;


import hello.fifthweek.domain.member.record.response.MemberHistoryDomainResponse;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "MEMBER_HISOTRY")
public class MemberHistoryInfraEntity {

    @Id
    @Column(name = "MEMBER_ID")
    private long memberId;
    
    @Column(name = "INDE_AMOUNT")
    private int indeAmount;

    @Column(name = "TOTAL_BALANCE")
    private int totalBalacne;
    
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;


    public MemberHistoryDomainResponse toDomain() {
        return new MemberHistoryDomainResponse(memberId, indeAmount, totalBalacne, createdAt);
    }
}
