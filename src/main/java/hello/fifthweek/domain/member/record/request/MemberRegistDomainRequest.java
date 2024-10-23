package hello.fifthweek.domain.member.record.request;


import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;

public record MemberRegistDomainRequest(long memberId, int memberBalance) {

    public MemberRegistInfraEntity toEntity() {
        MemberRegistInfraEntity entity = new MemberRegistInfraEntity();
        entity.setMemberId(memberId);
        entity.setMemberBalance(memberBalance);

        return entity;
    }
}
