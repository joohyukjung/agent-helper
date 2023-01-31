package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.PatientId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * NOT NULL 로 정의된 모든 필드에 @Id 지정
 */

@Entity
@Table(name = "TFN_PATIENT")
@IdClass(PatientId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Patient {
    @Id
    private String patId;
    @Id
    private String patFlnm;
    private String patFtnm;
    private String patLtnm;
    private String telno;
    private String emlAddr;
    private String sexCd;
    private String brdt;
    private String zip;
    private String addr;
    private String regnAddr;
    private String roadNm;
    private String daddrl;
    private String refAddr;
    @Id
    private Timestamp lastChgDt;
}
