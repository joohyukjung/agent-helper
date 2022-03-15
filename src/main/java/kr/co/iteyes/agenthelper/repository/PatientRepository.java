package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Patient;
import kr.co.iteyes.agenthelper.entity.id.PatientId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, PatientId> {
    @Query("select p from Patient p where p.patId = :pId")
    List<Patient> findAllResource(String pId);
}
