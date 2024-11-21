package hello.fifthweek.domain.member.kafka;



public interface MemberProducerService {

    void sendEvent(String topic, String message);

}
