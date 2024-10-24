package hello.fifthweek.interfaces.payment;


import hello.fifthweek.interfaces.payment.record.request.PayInterfacesRequest;
import hello.fifthweek.interfaces.payment.record.request.PaymentAddHistoryInterfacesRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentFacade paymentFacade;


    @GetMapping("/paymentAddHistory")
    public boolean paymentAddHistory(@RequestParam long memberId, @RequestParam long orderId,@RequestParam int paymentAmount) {
        return paymentFacade.paymentAddHistory(memberId, orderId, paymentAmount);
    }

    @PostMapping("/pay")
    public boolean pay(@RequestBody PayInterfacesRequest payInterfacesRequest) throws Exception {
        return paymentFacade.pay(payInterfacesRequest);
    }
}
