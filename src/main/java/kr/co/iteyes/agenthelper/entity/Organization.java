package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.OrganizationId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_ORG")
@IdClass(OrganizationId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Organization {
    @Id
    private String cisn;
    private String careInstNm;
    private String hpcfDvcd;
    private String hpcfDvnm;
    private String telno;
    private String zip;
    private String addr;
    private String regnAddr;
    private String roadNm;
    private String daddrl;
    private String refAddr;
    @Id
    private Timestamp lastChgDt;
}
