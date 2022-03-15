package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Condition;
import kr.co.iteyes.agenthelper.entity.id.ConditionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConditionRepository extends JpaRepository<Condition, ConditionId> {
    @Query("select c from Condition c, Encounter e where 1=1 and c.rcptNo = e.rcptNo and e.patId = :patientId and e.mediBgngYmd between :startDate and :endDate")
    List<Condition> findAllResource(String patientId, String startDate, String endDate);
}
