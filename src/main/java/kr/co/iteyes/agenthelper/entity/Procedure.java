package kr.co.iteyes.agenthelper.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_SURGERY")
@Getter
public class Procedure {
    private String cisn;
    private String rrno;
    private Long receptNo;
    private Date mediBgngYmd;
    @Id
    private String patId;
    private Date srgDt;
    private String srgCd;
    private String srgNm;
    private String anesKndCd;
    private String anesKindNm;
    private Long drln;
    private String drId;
    private String drNm;
    private String prctSubjCd;
    private String prctSubjNm;
    private Long srgDrln;
    private String srgDrId;
    private String srgDrNm;
    private String srgPrctSubjCd;
    private String srgPrctSubjNm;
    private String srgSt;
    private Timestamp lastChgDt;
}
