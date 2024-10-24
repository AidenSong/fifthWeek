package hello.fifthweek.domain.member;


import hello.fifthweek.domain.member.record.request.MemberHistoryDomainRequest;
import hello.fifthweek.domain.member.record.request.MemberRegistDomainRequest;
import hello.fifthweek.domain.member.record.request.UpdateMemberBalanceDomainRequest;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public boolean memberRegist(MemberRegistDomainRequest memberRegistDomainRequest) {
        return memberRepository.memberRegist(memberRegistDomainRequest.toEntity());
    }

    public MemberInfoInterfacesResponse memberInfo(long memberId) {
        MemberInfoDomainResponse response = memberRepository.memberInfo(memberId);
        return response.toInterfaces();
    }

    public boolean memberAddHistory(MemberHistoryDomainRequest memberHistoryDomainRequest) {
        return memberRepository.memberAddHistory(memberHistoryDomainRequest.toEntity());
    }

    public boolean updateMemberBalance(UpdateMemberBalanceDomainRequest updateMemberBalanceDomainRequest) {

        return memberRepository.updateMemberBalance(updateMemberBalanceDomainRequest.toEntity());
    }

}
