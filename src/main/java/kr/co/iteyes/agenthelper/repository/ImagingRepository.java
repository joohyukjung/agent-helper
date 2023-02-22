package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Imaging;
import kr.co.iteyes.agenthelper.entity.id.ImagingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface ImagingRepository extends JpaRepository<Imaging, ImagingId> {
    @Query("select i from Imaging i where i.patId = :patientId and i.rcptNo = :rcptNo")
    List<Imaging> findAllResource(String patientId, BigInteger rcptNo);
}
