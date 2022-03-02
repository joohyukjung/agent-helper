package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, String> {
    @Query("select p from Patient p where p.patId = :patientId")
    List<Patient> findAllResource(String patientId);
}
