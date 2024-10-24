package hello.fifthweek.domain.payment;


public interface PaymentRepository {


    boolean paymentAddHistory(long memberId, long orderId, int paymentAmount);
}
