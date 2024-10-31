package hello.fifthweek.interfaces.member;


import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.interfaces.member.record.request.MemberHistoryInterfacesRequest;
import hello.fifthweek.interfaces.member.record.request.MemberRegistInterfacesRequest;
import hello.fifthweek.interfaces.member.record.request.UpdateMemberBalanceInterfacesRequest;
import hello.fifthweek.interfaces.member.record.response.MemberHistoryInterfacesResponse;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public MemberInfoInterfacesResponse memberInfo(@RequestParam long memberId) {
        return memberService.memberInfo(memberId);
    }

    @PostMapping("/memberAddHistory")
    @Operation(summary = "회원기록 추가")
    public boolean memberAddHistory(@RequestBody MemberHistoryInterfacesRequest memberHistoryInterfacesRequest) {
        return memberService.memberAddHistory(memberHistoryInterfacesRequest.toDomain());
    }

    @PutMapping("/updateMemberPoint")
    @Operation(summary = "회원 포인트 변경")
    public boolean updateMemberBalance(@RequestBody UpdateMemberBalanceInterfacesRequest updateMemberBalanceInterfacesRequest) {
        return memberService.updateMemberBalance(updateMemberBalanceInterfacesRequest.toDomain());
    }

    @GetMapping("/memberHistory")
    @Operation(summary = "회원정보 기록")
    public List<MemberHistoryInterfacesResponse> memberHistory(@RequestParam long memberId) {
        return memberService.memberHistory(memberId);
    }

}
