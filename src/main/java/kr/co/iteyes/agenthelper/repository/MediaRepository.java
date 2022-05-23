package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Media;
import kr.co.iteyes.agenthelper.entity.id.MediaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, MediaId> {
    @Query("select m from Media m where m.patNo = :patientId and m.rcptNo = :rcptNo")
    List<Media> findAllResource(String patientId, Long rcptNo);
}
