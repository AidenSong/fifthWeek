package hello.fifthweek.domain.member.record.request;


import hello.fifthweek.infrastructure.entitiy.MemberRegistEntity;

public record MemberRegistDomainRequest(long memberId, int memberBalance) {

    public MemberRegistEntity toEntity() {
        MemberRegistEntity entity = new MemberRegistEntity();
        entity.setMemberId(memberId);
        entity.setMemberBalance(memberBalance);

        return entity;
    }
}
