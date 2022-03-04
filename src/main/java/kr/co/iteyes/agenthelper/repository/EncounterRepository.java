package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Encounter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EncounterRepository extends JpaRepository<Encounter, Long> {
    @Query("select e from Encounter e where e.patId = :patientId")
    List<Encounter> findAllResource(String patientId);
}
