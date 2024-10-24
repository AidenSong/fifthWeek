package hello.fifthweek.domain.payment;


import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@Transactional
@RequiredArgsConstructor
public class PaymentService {


    private final PaymentRepository paymentRepository;


    public boolean paymentAddHistory(long memberId, long orderId, int paymentAmount) {
        return paymentRepository.paymentAddHistory(memberId, orderId, paymentAmount);
    }

}
