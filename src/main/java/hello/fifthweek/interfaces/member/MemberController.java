package hello.fifthweek.interfaces.member;


import hello.fifthweek.domain.member.MemberService;
import hello.fifthweek.interfaces.member.record.request.MemberHistoryInterfacesRequest;
import hello.fifthweek.interfaces.member.record.request.MemberRegistInterfacesRequest;
import hello.fifthweek.interfaces.member.record.request.MemberRegistInterfacesRequest.PaymentAddHistoryInterfacesRequest;
import hello.fifthweek.interfaces.member.record.request.PayInterfacesRequest;
import hello.fifthweek.interfaces.member.record.response.MemberInfoInterfacesResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/member")
@RequiredArgsConstructor
public class MemberController {


    private final MemberFacade memberFacade;

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

    @PostMapping("/memberAddHistory")
    @Operation(summary = "회원기록 추가")
    public boolean memberAddHistory(@RequestBody MemberHistoryInterfacesRequest memberHistoryInterfacesRequest) {
        return memberService.memberAddHistory(memberHistoryInterfacesRequest.toDomain());
    }

    @PostMapping("/paymentAddHistory")
    @Operation(summary = "결제기록 추가")
    public boolean paymentAddHistory(@RequestBody PaymentAddHistoryInterfacesRequest paymentAddHistoryInterfacesRequest) {
        return memberService.paymentAddHistory(paymentAddHistoryInterfacesRequest.toDomain());
    }

    @PutMapping("/pay")
    @Operation(summary = "금액 결제")
    public boolean pay(@RequestBody PayInterfacesRequest payInterfacesRequest) {
        memberFacade.pay(payInterfacesRequest);
        return true;
    }
}
