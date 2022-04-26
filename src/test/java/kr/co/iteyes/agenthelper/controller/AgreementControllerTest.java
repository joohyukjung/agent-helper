package kr.co.iteyes.agenthelper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.iteyes.agenthelper.dto.AgreementDto;
import kr.co.iteyes.agenthelper.dto.AgreementReqDto;
import kr.co.iteyes.agenthelper.dto.AgreementUpdateDto;
import kr.co.iteyes.agenthelper.service.AgreementService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.sql.Timestamp;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.put;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@AutoConfigureRestDocs
@SpringBootTest
class AgreementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private AgreementService agreementService;

    @Test
    void createAgreement() throws Exception {
        // given
        AgreementReqDto agreementReqDto = AgreementReqDto.builder()
                .cisn("21100021")
                .rrno("7107061902425")
                .utilUserId("800000001")
                .build();

        // when
        ResultActions result = this.mockMvc.perform(
                        post("/agreement")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(agreementReqDto))
        );

        // then
        result.andExpect(status().isOk())
                .andDo(document("create-agreement",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        requestFields(
                                fieldWithPath("cisn").type(JsonFieldType.STRING).description("의료기관의 고유 번호(심평원)"),
                                fieldWithPath("rrno").type(JsonFieldType.STRING).description("환자 주민등록번호"),
                                fieldWithPath("utilUserId").type(JsonFieldType.STRING).description("마이헬스웨이에서 생성된 환자 ID")
                        )
//                        responseFields(
//                                fieldWithPath("cisn").type(JsonFieldType.STRING).description("의료기관의 고유 번호(심평원)"),
//                                fieldWithPath("ci_no").type(JsonFieldType.STRING).description("환자 주민등록번호"),
//                                fieldWithPath("pat_id").type(JsonFieldType.STRING).description("의료기관 환자 번호"),
//                                fieldWithPath("util_user_id").type(JsonFieldType.STRING).description("마이헬스웨이에서 생성된 환자 ID"),
//                                fieldWithPath("pvsn_inst_cd").type(JsonFieldType.NUMBER).description("마이헬스웨이에서 생성된 기관 번호"),
//                                fieldWithPath("rcb_prct_ymd").type(JsonFieldType.STRING).description("최근 방문 일자"),
//                                fieldWithPath("reg_ymd").type(JsonFieldType.STRING).description("등록 일자"),
//                                fieldWithPath("fhir_pat_index_id").type(JsonFieldType.STRING).description("FHIR 환자 Resource INDEX ID"),
//                                fieldWithPath("fhir_org_index_id").type(JsonFieldType.STRING).description("FHIR 의료기관 Resource INDEX ID"),
//                                fieldWithPath("last_mdfcn_dt").type(JsonFieldType.STRING).description("최종 변경 일시")
//                        )
                ));
    }

    @Test
    void updateAgreement() throws Exception {
        // given
        AgreementUpdateDto agreementUpdateDto = AgreementUpdateDto.builder()
                .rcbPrctYmd("20200401")
                .fhirPatIndexId("12345")
                .fhirOrgIndexId("67890")
                .build();
        String utilUserId = "user01";

        // when
        ResultActions result = this.mockMvc.perform(
                put("/agreement/{utilUserId}", utilUserId)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(agreementUpdateDto))
        );

        // then
        result.andExpect(status().isOk())
                .andDo(document("update-agreement",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        pathParameters(
                                parameterWithName("utilUserId").description("마이헬스웨이에서 생성된 환자 ID")
                        ),
                        requestFields(
                                fieldWithPath("rcbPrctYmd").type(JsonFieldType.STRING).description("최근 방문 일자"),
                                fieldWithPath("fhirPatIndexId").type(JsonFieldType.STRING).description("FHIR 환자 Resource INDEX ID"),
                                fieldWithPath("fhirOrgIndexId").type(JsonFieldType.STRING).description("FHIR 의료기관 Resource INDEX ID")
                        )
                ));
    }

//    @Test
//    void getAgreement() throws Exception {
//        // given
//        AgreementDto agreementDto = AgreementDto.builder()
//                .cisn("21100021")
//                .rrno("7107061902425")
//                .patId("patient01")
//                .utilUserId("800000001")
//                .pvsnInstCd(21100021L)
//                .rcbPrctYmd("20220101")
//                .fhirPatIndexId("12345")
//                .fhirOrgIndexId("67890")
//                .regYmd("20220101")
//                .lastMdfcnDt(new Timestamp(System.currentTimeMillis()))
//                .build();
//        when(agreementService.getAgreement(any())).thenReturn(agreementDto);
//
//        // when
//        ResultActions result = this.mockMvc.perform(
//                get("/agreement/{utilUserId}", agreementDto.getUtilUserId())
//                        .accept(MediaType.APPLICATION_JSON)
//        );
//
//        // then
//        result.andExpect(status().isOk())
//                .andDo(document("get-agreement",
//                        pathParameters(
//                                parameterWithName("utilUserId").description("마이헬스웨이에서 생성된 환자 ID")
//                        ),
//                        responseFields(
//                                fieldWithPath("cisn").type(JsonFieldType.STRING).description("의료기관의 고유 번호(심평원)"),
//                                fieldWithPath("rrno").type(JsonFieldType.STRING).description("환자 주민등록번호"),
//                                fieldWithPath("pat_id").type(JsonFieldType.STRING).description("의료기관 환자 번호"),
//                                fieldWithPath("util_user_id").type(JsonFieldType.STRING).description("마이헬스웨이에서 생성된 환자 ID"),
//                                fieldWithPath("pvsn_inst_cd").type(JsonFieldType.NUMBER).description("마이헬스웨이에서 생성된 기관 번호"),
//                                fieldWithPath("rcb_prct_ymd").type(JsonFieldType.STRING).description("최근 방문 일자"),
//                                fieldWithPath("reg_ymd").type(JsonFieldType.STRING).description("등록 일자"),
//                                fieldWithPath("fhir_pat_index_id").type(JsonFieldType.STRING).description("FHIR 환자 Resource INDEX ID"),
//                                fieldWithPath("fhir_org_index_id").type(JsonFieldType.STRING).description("FHIR 의료기관 Resource INDEX ID"),
//                                fieldWithPath("last_mdfcn_dt").type(JsonFieldType.STRING).description("최종 변경 일시")
//                        )
//                ));
//    }
}