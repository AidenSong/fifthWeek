package hello.fifthweek.infrastructure;


import hello.fifthweek.domain.member.MemberRepository;
import hello.fifthweek.domain.member.record.response.MemberInfoDomainResponse;
import hello.fifthweek.infrastructure.entitiy.MemberHistoryEntity;
import hello.fifthweek.infrastructure.entitiy.MemberInfoEntity;
import hello.fifthweek.infrastructure.entitiy.MemberRegistEntity;
import hello.fifthweek.infrastructure.jparepository.MemberHistoryJpaRepository;
import hello.fifthweek.infrastructure.jparepository.MemberInfoJpaRepository;
import hello.fifthweek.infrastructure.jparepository.MemberRegistJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberRepository {



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
