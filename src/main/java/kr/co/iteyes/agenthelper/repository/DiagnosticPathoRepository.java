package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.DiagnosticPatho;
import kr.co.iteyes.agenthelper.entity.id.DiagnosticPathoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface DiagnosticPathoRepository extends JpaRepository<DiagnosticPatho, DiagnosticPathoId> {
    @Query("select d from DiagnosticPatho d where d.patId = :patientId and d.mediBgngYmd between :startDate and :endDate")
    List<DiagnosticPatho> findAllResource(String patientId, String startDate, String endDate);
}
