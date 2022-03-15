package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.DiagnosticRadio;
import kr.co.iteyes.agenthelper.entity.id.DiagnosticRadioId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface DiagnosticRadioRepository extends JpaRepository<DiagnosticRadio, DiagnosticRadioId> {
    @Query("select d from DiagnosticRadio d where d.patId = :patientId and d.inspDt between :startDate and :endDate")
    List<DiagnosticRadio> findAllResource(String patientId, Date startDate, Date endDate);
}
