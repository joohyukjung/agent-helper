package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_PATIENT")
@Getter
public class Patient {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cisn;
    private String rrno;
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
