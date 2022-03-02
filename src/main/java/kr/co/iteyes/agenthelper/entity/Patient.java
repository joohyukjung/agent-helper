package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PATIENT")
@Getter
public class Patient {
    private String cisn;
    private String rrno;
    @Id
    private String patId;
    private String patFlnm;
    private String patFtnm;
    private String patLtnm;
    private String telno;
    private String emlAddr;
    private String sexCd;
    private String sex;
    private Date brdt;
    private String zip;
    private String addr;
    private String regnAddr;
    private String roadNm;
    private String daddrl;
    private String refAddr;
    private Timestamp lastChgDt;
}
