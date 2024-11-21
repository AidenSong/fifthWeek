package hello.fifthweek.domain.member.kafka;


import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;




@Component
@RequiredArgsConstructor
public class MemberProducerServiceImpl implements MemberProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;


    @Override
    public void sendEvent(String topic, String message) {
        kafkaTemplate.send(topic, message);
    }
}
