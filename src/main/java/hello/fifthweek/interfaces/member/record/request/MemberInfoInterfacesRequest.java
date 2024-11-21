package hello.fifthweek.interfaces.member.record.request;


import hello.fifthweek.domain.member.record.request.MemberInfoDomainRequest;

public record MemberInfoInterfacesRequest(
        long memberId,
        int memberBalance
    ) {

    public MemberInfoDomainRequest toDomain(){
        return new MemberInfoDomainRequest(memberId, memberBalance);
    }
}
