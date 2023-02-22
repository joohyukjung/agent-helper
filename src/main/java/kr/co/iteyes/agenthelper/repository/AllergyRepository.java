package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Allergy;
import kr.co.iteyes.agenthelper.entity.id.AllergyId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface AllergyRepository extends JpaRepository<Allergy, AllergyId> {
    @Query("select a from Allergy a where a.patId = :patientId and a.rcptNo = :rcptNo")
    List<Allergy> findAllResource(String patientId, BigInteger rcptNo);
}
