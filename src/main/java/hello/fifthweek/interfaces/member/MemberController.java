package hello.fifthweek.interfaces.member;


import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.interfaces.member.record.request.MemberHistoryInterfacesRequest;

import hello.fifthweek.interfaces.member.record.request.MemberRegistInterfacesRequest;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "회원 등록")
    public boolean memberRegist(@RequestBody MemberRegistInterfacesRequest memberRegistInterfacesRequest) {
        return memberService.memberRegist(memberRegistInterfacesRequest.toDomain());
    }


    @GetMapping("/memberInfo")
    @Operation(summary = "회원정보 조회")
    public MemberInfoInterfacesResponse memberInfo(long memberId) {
        return memberService.memberInfo(memberId);
    }

    @PostMapping("/addHistory")
    @Operation(summary = "회원기록 추가")
    public boolean addHistory(@RequestBody MemberHistoryInterfacesRequest memberHistoryInterfacesRequest) {
        return memberService.addHistory(memberHistoryInterfacesRequest.toDomain());
    }
}
