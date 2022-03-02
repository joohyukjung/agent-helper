package kr.co.iteyes.agenthelper.repository;

import kr.co.iteyes.agenthelper.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, String> {
    @Query("select o from Organization o")
    List<Organization> findAllResource();
}
