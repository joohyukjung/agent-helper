package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MedicationRepository extends JpaRepository<Medication, String> {
    @Query("select m from Medication m where m.patId = :patientId and m.rxDt between :startDate and :endDate")
    List<Medication> findAllResource(String patientId, Date startDate, Date endDate);
}
