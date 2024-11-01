package hello.fifthweek.domain.member;

import hello.fifthweek.domain.member.record.request.UpdateMemberBalanceDomainRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class MemberServiceTest {

    @Autowired
    private MemberRepository memberRepository;



    @Test
    void updateMemberBalance() {
        long memberId = 1L;
        int memberBalance = 1000000;

        ExecutorService executor = Executors.newFixedThreadPool(10);
        int taskCount = 10;

        Callable<Void> task = () -> {
            memberRepository.updateMemberBalance(new UpdateMemberBalanceDomainRequest(memberId, memberBalance).toEntity()); // 쓰기 메서드 호출
            return null;
        };

        // 동시 호출로 쓰기 락 테스트
        for (int i = 0; i < taskCount; i++) {
            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        // 모든 스레드가 동시에 접근했지만, 동시성이 잘 관리되었는지 확인
        assertEquals(taskCount, counterBean.getCount(), "쓰기를 테스트 중에 동시성 문제 발생");
    }
}