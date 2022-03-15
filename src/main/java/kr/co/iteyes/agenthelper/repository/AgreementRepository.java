package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Agreement;
import kr.co.iteyes.agenthelper.entity.Allergy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface AgreementRepository extends JpaRepository<Agreement, String> {

}
