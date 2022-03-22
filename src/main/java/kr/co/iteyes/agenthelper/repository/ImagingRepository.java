package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Imaging;
import kr.co.iteyes.agenthelper.entity.id.ImagingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImagingRepository extends JpaRepository<Imaging, ImagingId> {
    @Query("select i from Imaging i where i.patNo = :patientId and i.mediBgngYmd between :startDate and :endDate")
    List<Imaging> findAllResource(String patientId, String startDate, String endDate);
}
