package hello.fifthweek.infrastructure.member;


import hello.fifthweek.domain.member.MemberRepository;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberInfoInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistInfraEntity;
import hello.fifthweek.infrastructure.member.entitiy.PaymentAddHistoryInfraEntity;
import hello.fifthweek.infrastructure.member.jparepository.MemberHistoryJpaRepository;
import hello.fifthweek.infrastructure.member.jparepository.MemberInfoJpaRepository;
import hello.fifthweek.infrastructure.member.jparepository.MemberRegistJpaRepository;
import hello.fifthweek.infrastructure.member.jparepository.PaymentAddHistoryJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {



    private final MemberInfoJpaRepository memberInfoJpaRepository;
    private final MemberHistoryJpaRepository memberHistoryJpaRepository;
    private final MemberRegistJpaRepository memberRegistJpaRepository;
    private final PaymentAddHistoryJpaRepository paymentAddHistoryJpaRepository;


    @Override
    public boolean memberRegist(MemberRegistInfraEntity memberRegistInfraEntity) {

        MemberRegistInfraEntity response = memberRegistJpaRepository.save(memberRegistInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public MemberInfoDomainResponse memberInfo(long memberId) {

        Optional<MemberInfoInfraEntity> response = memberInfoJpaRepository.findById(memberId);
        if (response == null) {
            return null;
        }
        return response.get().toDomain();
    }

    public boolean memberAddHistory(MemberHistoryInfraEntity memberHistoryInfraEntity) {

        MemberHistoryInfraEntity response = memberHistoryJpaRepository.save(memberHistoryInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean paymentAddHistory(PaymentAddHistoryInfraEntity paymentAddHistoryInfraEntity) {
        PaymentAddHistoryInfraEntity response = paymentAddHistoryJpaRepository.save(paymentAddHistoryInfraEntity);
        if (response == null) {
            return false;
        }
        return true;
    }
}
