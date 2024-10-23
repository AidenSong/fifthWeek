package hello.fifthweek.infrastructure.member;


import hello.fifthweek.domain.member.MemberRepository;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.member.entitiy.MemberHistoryEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberInfoEntity;
import hello.fifthweek.infrastructure.member.entitiy.MemberRegistEntity;
import hello.fifthweek.infrastructure.member.jparepository.MemberHistoryJpaRepository;
import hello.fifthweek.infrastructure.member.jparepository.MemberInfoJpaRepository;
import hello.fifthweek.infrastructure.member.jparepository.MemberRegistJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {



    private final MemberInfoJpaRepository memberInfoJpaRepository;
    private final MemberHistoryJpaRepository memberHistoryJpaRepository;
    private final MemberRegistJpaRepository memberRegistJpaRepository;


    @Override
    public boolean memberRegist(MemberRegistEntity memberRegistEntity) {

        MemberRegistEntity response = memberRegistJpaRepository.save(memberRegistEntity);
        if (response == null) {
            return false;
        }
        return true;
    }

    @Override
    public MemberInfoDomainResponse memberInfo(long memberId) {

        Optional<MemberInfoEntity> response = memberInfoJpaRepository.findById(memberId);
        if (response == null) {
            return null;
        }
        return response.get().toDomain();
    }

    public boolean memberHistory(MemberHistoryEntity memberHistoryEntity) {

        MemberHistoryEntity response = memberHistoryJpaRepository.save(memberHistoryEntity);
        if (response == null) {
            return false;
        }
        return true;
    }
}
