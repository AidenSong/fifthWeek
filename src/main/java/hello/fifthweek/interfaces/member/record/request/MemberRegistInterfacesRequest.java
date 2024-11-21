package hello.fifthweek.interfaces.member.record.request;

import hello.fifthweek.domain.member.record.request.MemberRegistDomainRequest;

public record MemberRegistInterfacesRequest(long memberId, int memberBalance) {


    public MemberRegistDomainRequest toDomain() {
        return new MemberRegistDomainRequest(memberId, memberBalance);
    }
}
