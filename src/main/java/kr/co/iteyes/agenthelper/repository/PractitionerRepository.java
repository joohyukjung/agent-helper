package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Practitioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PractitionerRepository extends JpaRepository<Practitioner, Long> {
    @Query("select p from Practitioner p where p.drId = :doctorId")
    List<Practitioner> findAllResource(String doctorId);
}
