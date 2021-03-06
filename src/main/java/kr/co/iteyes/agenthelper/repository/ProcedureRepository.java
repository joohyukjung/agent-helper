package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Procedure;
import kr.co.iteyes.agenthelper.entity.id.ProcedureId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ProcedureRepository extends JpaRepository<Procedure, ProcedureId> {
    @Query("select p from Procedure p where p.patId = :patientId and p.mediBgngYmd between :startDate and :endDate")
    List<Procedure> findAllResource(String patientId, Long startDate, Long endDate);
}
