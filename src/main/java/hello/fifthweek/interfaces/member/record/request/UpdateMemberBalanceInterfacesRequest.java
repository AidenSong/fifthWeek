package hello.fifthweek.interfaces.member.record.request;

import hello.fifthweek.domain.member.record.request.UpdateMemberBalanceDomainRequest;

public record UpdateMemberBalanceInterfacesRequest(long memberId, int memberBalance) {


    public UpdateMemberBalanceDomainRequest toDomain() {
        return new UpdateMemberBalanceDomainRequest(memberId, memberBalance);
    }
}
