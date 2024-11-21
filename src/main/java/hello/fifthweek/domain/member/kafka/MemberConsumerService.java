package hello.fifthweek.domain.member.kafka;

public interface MemberConsumerService {

    void handleMemberEvent(String message);
}
