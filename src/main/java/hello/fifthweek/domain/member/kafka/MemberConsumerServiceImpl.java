package hello.fifthweek.domain.member.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MemberConsumerServiceImpl implements MemberConsumerService{




    @KafkaListener(topics = "memberHistory", groupId = "memberGroup")
    @Override
    public void handleMemberEvent(String message) {
        System.out.println("Kafka Consumer Event : " + message);
    }
}
