package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Condition;
import kr.co.iteyes.agenthelper.entity.id.ConditionId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConditionRepository extends JpaRepository<Condition, ConditionId> {
    @Query("select c from Condition c where c.patId = :patientId and c.rcptNo = :rcptNo")
    List<Condition> findAllResource(String patientId, Long rcptNo);
}
