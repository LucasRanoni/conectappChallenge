package com.api.conectapps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

//@Import(ConfigSecmLoginControllerTest.class)
@ActiveProfiles(value = "ConfigSecmLoginControllerTest")

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
@TestPropertySource(locations="classpath:test.properties")
class LogoutControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @MockBean
//    private ISecmUserValidator secm;
//
//    //LOGOUT BADREQUEST
//    @Test
//    public void testLogoutWithoutTokenIsBadRequest() throws Exception {
//        this.mockMvc.perform(get("/logout")
//                        .header("correlationId", ""))
//                .andDo(print())
//                .andExpect(status().isBadRequest());
//    }
//
//    //LOGOUT UNPROCESSABLEENTITY
//    @Test
//    public void testLogoutWithEmptyTokenIsUnprocessableEntity() throws Exception {
//        this.mockMvc.perform(get("/logout")
//                        .header("token","")
//                        .header("correlationId", ""))
//                .andDo(print())
//                .andExpect(status().isUnprocessableEntity());
//    }
//
//    //LOGOUT OK
//    @Test
//    public void testLogoutWithTokenIsOk() throws Exception {
//        this.mockMvc.perform(get("/logout")
//                        .header("token","SECM-01639513237453-9")
//                        .header("correlationId", ""))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//    //LOGOUT OK WITHOUT correlationId
//    @Test
//    public void testLogoutWithoutCorretarionIdIsOk() throws Exception {
//        this.mockMvc.perform(get("/logout")
//                        .header("token","SECM-01639513237453-9"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//    //LOGOUT INTERNALSERVERERROR
//    @Test
//    public void testLogoutWithTokenIsInternalServerError() throws Exception {
//        Mockito.doThrow(new Exception()).doNothing().when(secm).logoutUser("SECM-01639513237453-9");
//
//        this.mockMvc.perform(get("/logout")
//                        .header("token","SECM-01639513237453-9")
//                        .header("correlationId", ""))
//                .andDo(print())
//                .andExpect(status().isInternalServerError());
//    }
//
//    @Test
//    void logout() {
//    }
}