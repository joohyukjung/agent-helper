package kr.co.iteyes.agenthelper.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import kr.co.iteyes.agenthelper.entity.id.ImagingId;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "TFN_INSP_DICOM")
@IdClass(ImagingId.class)
@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Imaging {
    @Id
    private BigInteger seqNo;
    private BigInteger rcptNo;
    @Id
    private String patId;
    private String inspDt;
    private String instpSts;
    private String dcmSerieseUid;
    private String modalCd;
    private String modalNm;
    private String description;
    private String bodySiteCd;
    private String bodySiteNm;
    private Timestamp lastChgDt;
}
