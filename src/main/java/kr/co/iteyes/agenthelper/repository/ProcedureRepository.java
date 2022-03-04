package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
    @Query("select p from Procedure p where p.patId = :patientId and p.srgDt between :startDate and :endDate")
    List<Procedure> findAllResource(String patientId, Date startDate, Date endDate);
}
