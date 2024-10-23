package hello.fifthweek.domain.member.record.request;


import hello.fifthweek.infrastructure.entitiy.MemberInfoEntity;

import java.time.LocalDateTime;

public record MemberInfoDomainRequest(
        long memberId,
        int memberBalance
    ) {

    public MemberInfoEntity toEntity() {
        MemberInfoEntity entity = new MemberInfoEntity();
        entity.setMEMBER_ID(memberId);
        entity.setMEMBER_BALANCE(memberBalance);

        return entity;
    }
}
