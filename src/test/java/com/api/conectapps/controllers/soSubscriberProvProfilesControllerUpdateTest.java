package com.api.conectapps.controllers;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:test.properties")
class soSubscriberProvProfilesControllerUpdateTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private ProvServices service;
//
//    @MockBean
//    private ISecmUserValidator securityService;
//
//
//
//    @Test
//    void updateSubscriberWithoutTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(put("/soSubscriberProvProfiles/"+ msisdnRequest)
//                .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//    @Test
//    public void updateSubscriberWithEmptyTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(put("/soSubscriberProvProfiles/" + msisdnRequest)
//                .header("token", "")
//                .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//    @Test
//    void updateSubscriberWithInvalidTokenIsUnauthorized() throws Exception {
//        SecmRequestInfo secmRequestInfo = new SecmRequestInfo();
//        secmRequestInfo.setStatus(401);
//        secmRequestInfo.setUserName("ADMIN");
//        Mockito.when(securityService.validPermission(any(),any())).thenReturn(secmRequestInfo);
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(put("/soSubscriberProvProfiles/"+ msisdnRequest)
//                .header("correlationId", "1234567890")
//                .content("{ \"addSoProvProfileIdList\": \"SO_BSC_PROFILE_2\"}").contentType(MediaType.APPLICATION_JSON)
//                .header("token","12345"))
//                .andDo(print())
//                .andExpect(status().isUnauthorized());
//    }
//    //insuficcient permission
//    @Test
//    public void updateSubscriberWithTokenIsForbidden() throws Exception {
//        SecmRequestInfo secmRequestInfo = new SecmRequestInfo();
//        secmRequestInfo.setStatus(403);
//        secmRequestInfo.setUserName("ADMIN");
//        when(securityService.validPermission(any(),any())).thenReturn(secmRequestInfo);
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(put("/soSubscriberProvProfiles/" + msisdnRequest)
//                .header("token", "SECM-01642442009942-7")
//                .content("{ \"addSoProvProfileIdList\": \"SO_BSC_PROFILE_2\"}").contentType(MediaType.APPLICATION_JSON)
//                .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isForbidden());
//    }
//
//    @Test
//    public void updateSubscriberWithoutListIsBadRequest() throws Exception {
//        SecmRequestInfo secmRequestInfo = new SecmRequestInfo();
//        secmRequestInfo.setStatus(200);
//        secmRequestInfo.setUserName("ADMIN");
//        when(securityService.validPermission(eq("SECM-01642442009942-7"),any())).thenReturn(secmRequestInfo);
//        String msisdnRequest="447106111102";
////        when(service.update(any(),msisdnRequest)).thenReturn(HttpStatus.OK);
//        this.mockMvc.perform(put("/soSubscriberProvProfiles/" + msisdnRequest)
//                .header("token", "SECM-01642442009942-7")
//                .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//    @Test
//    public void updateSubscriberWithAddListIsOk() throws Exception {
//        HttpHeaders header = new HttpHeaders();
//        header.set("correlationId","correlationId");
//        SecmRequestInfo secmRequestInfo = new SecmRequestInfo();
//        secmRequestInfo.setStatus(200);
//        secmRequestInfo.setUserName("ADMIN");
//        when(securityService.validPermission(eq("SECM-01642442009942-7"),any())).thenReturn(secmRequestInfo);
//        String msisdnRequest="447106";
//        when(service.update(any(),eq(msisdnRequest),eq(secmRequestInfo),any(),any())).thenReturn(
//                new ResponseEntity<>( "{\n\"msisdn\": \"" + msisdnRequest + "\",\n"
//                        + "\"resultDescription\": \"Transaction successfully executed.\"\n}"
//                        , header, HttpStatus.OK));
//        MvcResult result = this.mockMvc.perform(put("/soSubscriberProvProfiles/" + msisdnRequest)
//                .header("token", "SECM-01642442009942-7")
//                .header("correlationId", "1234567890")
//                .content("{ \"addSoProvProfileIdList\": \"SO_BSC_PROFILE_2\"}").contentType(MediaType.APPLICATION_JSON))
//                .andDo(print())
//                .andExpect(status().isOk()).andReturn();
//        String content = result.getResponse().getContentAsString();
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        System.out.println(mapContent);
//
//        String msisdn = mapContent.get("msisdn");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_200));
//    }


}