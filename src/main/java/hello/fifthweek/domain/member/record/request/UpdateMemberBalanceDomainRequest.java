package hello.fifthweek.domain.member.record.request;

import hello.fifthweek.infrastructure.member.entitiy.UpdateMemberBalanceInfraEntity;

public record UpdateMemberBalanceDomainRequest(long memberId, int memberBalance) {


    public UpdateMemberBalanceInfraEntity toEntity() {
        UpdateMemberBalanceInfraEntity entity = new UpdateMemberBalanceInfraEntity();
        entity.setMemberId(memberId);
        entity.setMemberBalance(memberBalance);

        return entity;
    }
}
