package hello.fifthweek.domain.member.record.response;


import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;

public record MemberInfoDomainResponse(
        long memberId,
        int memberBalance
    ) {

    public MemberInfoInterfacesResponse toInterfaces() {
        return new MemberInfoInterfacesResponse(memberId, memberBalance);
    }
}
