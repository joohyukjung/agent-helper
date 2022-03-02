package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConditionRepository extends JpaRepository<Condition, String> {
    @Query("select c from Condition c where c.patId = :patientId and c.diagYmd between :startDate and :endDate")
    List<Condition> findAllResource(String patientId, Date startDate, Date endDate);
}
