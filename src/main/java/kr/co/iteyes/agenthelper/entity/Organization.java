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
    @Id
    private String careInstNm;
    @Id
    private String hpcfDvcd;
    @Id
    private String hpcfDvnm;
    private String telno;
    @Id
    private String zip;
    @Id
    private String addr;
    @Id
    private String regnAddr;
    private String roadNm;
    @Id
    private String daddrl;
    private String refAddr;
    private Timestamp lastChgDt;
}
