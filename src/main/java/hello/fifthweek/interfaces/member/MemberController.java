package hello.fifthweek.interfaces.member;


import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.interfaces.member.record.request.MemberHistoryInterfacesRequest;

import hello.fifthweek.interfaces.member.record.request.MemberRegistInterfacesRequest;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/member")
@RequiredArgsConstructor
public class MemberController {


    private final MemberService memberService;


    @PostMapping("/memberRegist")
    public boolean memberRegist(@RequestBody MemberRegistInterfacesRequest memberRegistInterfacesRequest) {
        return memberService.memberRegist(memberRegistInterfacesRequest.toDomain());
    }


    @GetMapping("/memberInfo")
    public MemberInfoInterfacesResponse memberInfo(long memberId) {
        return memberService.memberInfo(memberId);
    }

    @PostMapping("/addHistory")
    public boolean addHistory(@RequestBody MemberHistoryInterfacesRequest memberHistoryInterfacesRequest) {
        return memberService.addHistory(memberHistoryInterfacesRequest.toDomain());
    }
}
