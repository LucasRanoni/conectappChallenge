package com.api.conectapps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:test.properties")
public class soSubscriberProvProfilesControllerGetTest {

    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    private ProvServices service;
//
//    @MockBean
//    private ProvProfilesListBody bodyService;
//
//    @MockBean
//    private ISecmUserValidator securityService;
//
//    //invalid request format
//    @Test
//    public void testGetSubscriberWithoutTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//
//    @Test
//    public void testGetSubscriberWithEmptyTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("token", "")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//
//    @Test
//    public void testGetSubscriberWithNullMsisdnIsNotFound() throws Exception {
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" )
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isNotFound());
//    }
//
//    //expired token
//    @Test
//    public void testGetSubscriberWithExpiredTokenIsUnauthorized() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(401);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.get")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890")
//                        .header("soProvProfileIdList","SC1,SC2"))
//                .andDo(print())
//                .andExpect(status().isUnauthorized());
//    }
//
//    //insuficcient permission
//    @Test
//    public void testGetSubscriberWithTokenIsForbidden() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(403);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.get")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890")
//                        .header("soProvProfileIdList","SC1,SC2"))
//                .andDo(print())
//                .andExpect(status().isForbidden());
//    }
//
//    //repeated soServiceID
//    @Test
//    public void testGetSubscriberWithRepeatedSoServiceIDIsConflict() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(200);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.get")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("soProvProfileIdList","sc1,sc1")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isConflict());
//    }
//
//    //ok
//    @Test
//    public void testGetSubscriberWithValidTokenIsOk() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(200);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.get")).thenReturn(response);
//        String soServiceIdList = "sc1,sc2";
//        ProvProfilesListBody provProfilesListBody = new ProvProfilesListBody();
//        provProfilesListBody.setAddSoProvProfileIdList(soServiceIdList);
//
//        Mockito.when(service.get("447106111102", provProfilesListBody)).thenReturn("sc1,sc2");
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(get("/soSubscriberProvProfiles/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890")
//                        .header("soProvProfileIdList","sc1,sc2"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }

}
