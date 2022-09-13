package com.api.conectapps.controllers;

//import com.comviva.restservice.config.ConfigSecmControllersTest;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:test.properties")
public class SoSubsciberControllerDeleteTest {

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
//    //invalid request format
//    @Test
//    public void testDeleteSubscriberWithoutTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//
//    @Test
//    public void testDeleteSubscriberWithEmptyTokenIsBadRequest() throws Exception {
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("token", "")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//
//    //expired token
//    @Test
//    public void testDeleteSubscriberWithExpiredTokenIsUnauthorized() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(401);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.delete")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isUnauthorized());
//    }
//
//    //insuficcient permission
//    @Test
//    public void testDeleteSubscriberWithTokenIsForbidden() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(403);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.delete")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isForbidden());
//    }
//
//    //unexpected error
//    @Test
//    public void testDeleteSubscriberWithValidTokenIsInternalServerError() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(200);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.delete")).thenReturn(response);
//        Mockito.doThrow(new Exception()).when(service).delete("447106111102");
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isInternalServerError());
//    }
//
//
//    //ok
//    @Test
//    public void testDeleteSubscriberWithValidTokenIsOk() throws Exception {
//        SecmRequestInfo response = new SecmRequestInfo();
//        response.setStatus(200);
//        Mockito.when(securityService.validPermission("SECM-01642442009942-7","provisioning.delete")).thenReturn(response);
//
//        String msisdnRequest="447106111102";
//        this.mockMvc.perform(delete("/soSubscriber/" + msisdnRequest)
//                        .header("token", "SECM-01642442009942-7")
//                        .header("correlationId", "1234567890"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }

}
