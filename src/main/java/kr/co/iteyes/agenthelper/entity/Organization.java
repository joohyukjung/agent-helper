package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "TFN_ORG")
@Getter
public class Organization {
    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
