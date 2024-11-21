package hello.fifthweek.domain.member.record.request;


import hello.fifthweek.infrastructure.member.entitiy.MemberInfoInfraEntity;

public record MemberInfoDomainRequest(
        long memberId,
        int memberBalance
    ) {

    public MemberInfoInfraEntity toEntity() {
        MemberInfoInfraEntity entity = new MemberInfoInfraEntity();
        entity.setMEMBER_ID(memberId);
        entity.setMEMBER_BALANCE(memberBalance);

        return entity;
    }
}
