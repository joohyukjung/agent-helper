package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TFN_ORG")
@Getter
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
}
