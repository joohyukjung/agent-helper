package kr.co.iteyes.agenthelper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.iteyes.agenthelper.dto.AgreementReqDto;
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


import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.requestFields;
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
        final AgreementReqDto agreementReqDto = AgreementReqDto.builder()
                .cisn("11111111")
                .ciNo("22222222")
                .regYmd("20220301")
                .build();

        this.mockMvc.perform(
                post("/agreement")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(agreementReqDto))
                )
                .andExpect(status().isOk())
                .andDo(document("create-agreement",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        requestFields(
                                fieldWithPath("cisn").type(JsonFieldType.STRING).description("의료기관의 고유 번호(심평원)"),
                                fieldWithPath("ciNo").type(JsonFieldType.STRING).description("환자의 ci 인증 번호 또는 mhw 번호"),
                                fieldWithPath("regYmd").type(JsonFieldType.STRING).description("등록 일자")
                        )
                ));
    }
}