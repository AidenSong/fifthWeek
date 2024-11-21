package hello.fifthweek.infrastructure.payment;


import hello.fifthweek.domain.payment.PaymentRepository;
import hello.fifthweek.infrastructure.payment.entity.PaymentAddHistoryInfraEntity;
import hello.fifthweek.infrastructure.payment.jparepository.PaymentAddHistoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;



@Repository
@RequiredArgsConstructor
public class PaymentRepositoryImpl implements PaymentRepository {



    private final PaymentAddHistoryJpaRepository paymentAddHistoryJpaRepository;


    @Override
    public boolean paymentAddHistory(long memberId, long orderId, int paymentAmount) {
        PaymentAddHistoryInfraEntity entity = new PaymentAddHistoryInfraEntity();
        entity.setMemberId(memberId);
        entity.setOrderId(orderId);
        entity.setPaymentAmount(paymentAmount);

        PaymentAddHistoryInfraEntity response = paymentAddHistoryJpaRepository.save(entity);
        if (response == null) {
            return false;
        }
        return true;
    }
}
