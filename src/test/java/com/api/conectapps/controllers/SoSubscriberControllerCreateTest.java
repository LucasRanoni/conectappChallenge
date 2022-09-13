package com.api.conectapps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
//@Import(ConfigSoSucriberServiceControllersCreateTest.class)
@ActiveProfiles(value = "ConfigSoSucriberServiceControllersCreateTest")
@TestPropertySource( locations = "classpath:test.properties")
class SoSubscriberControllerCreateTest {

    @Autowired
    private MockMvc mockMvc;


//    @Test
//    void add_200() throws Exception{
//        String msisdnRequest = ConfigSoSucriberServiceControllersCreateTest.NAME_VALID;
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("token", ConfigSoSucriberServiceControllersCreateTest.TOKEN_HAS_PERMISION)
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(200))
//            .andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_200));
//    }
//
//    @Test
//    void add_409() throws Exception{
//        String msisdnRequest = ConfigSoSucriberServiceControllersCreateTest.NAME_NOT_VALID;
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("token", ConfigSoSucriberServiceControllersCreateTest.TOKEN_HAS_PERMISION)
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(409))
//            .andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_409_MS_ALREDY));
//    }
//
//    @Test
//    void add_401() throws Exception{
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("token", ConfigSoSucriberServiceControllersCreateTest.TOKEN_UNAUTHORIZED)
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(401))
//            .andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_401));
//    }
//
//    @Test
//    void add_403() throws Exception{
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("token", ConfigSoSucriberServiceControllersCreateTest.TOKEN_HAS_NOT_PERMISION)
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(403))
//            .andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_403));
//    }
//
//    @Test
//    void add_400_WithoutAnything() throws Exception {
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .servletPath("/soSubscriber/"+ msisdnRequest)
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(400)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }
//
//    @Test
//    void add_400_withOut_token() throws Exception {
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(400)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
////        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
////        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
////
////        String msisdn = mapContent.get("msisdn");
////        System.out.println("msisdn:[" + msisdn + "]");
////        assertTrue(msisdn != null);
////        assertTrue(msisdn.equals(msisdnRequest));
////
////        String resultDescription = mapContent.get("resultDescription");
////        System.out.println("resultDescription:[" + resultDescription + "]");
////        assertTrue(resultDescription != null);
////        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }
//
//    @Test
//    void add_400_withOut_Body() throws Exception {
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                 .servletPath("/soSubscriber/"+ msisdnRequest)
//                .header("token","token")
//                .header("correlationId","correlationId")
//            ).andExpect(status().is(400)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }
//
//    @Test
//    void add_404_withOut_pathVar() throws Exception {
//        //String msisdnRequest = null;
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber")
//                .header("token","token")
//                .header("correlationId","correlationId")
//            ).andExpect(status().is(404)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
////        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
////        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
////
////        String msisdn = mapContent.get("msisdn");
////        System.out.println("msisdn:[" + msisdn + "]");
////        assertTrue(msisdn != null);
////        assertTrue(msisdn.equals("null"));
////
////        String resultDescription = mapContent.get("resultDescription");
////        System.out.println("resultDescription:[" + resultDescription + "]");
////        assertTrue(resultDescription != null);
////        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }
//    @Test
//    void add_400_BodyEmpty() throws Exception {
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//                post("/soSubscriber/"+ msisdnRequest)
//                .header("token","token")
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(400)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }
//
//    @Test
//    void add_400_BodyWithMore10Services() throws Exception {
//        String msisdnRequest = "msisdnRequest";
//
//        MvcResult result = this.mockMvc.perform(
//            post("/soSubscriber/"+ msisdnRequest)
//                .header("token","token")
//                .header("correlationId","correlationId")
//                .content("{ \"addSoProvProfileIdList\": \"1,2,3,4,5,6,7,8,9,10,11\"}")
//                .contentType(MediaType.APPLICATION_JSON)
//            ).andExpect(status().is(400)).andReturn();
//        String content = result.getResponse().getContentAsString();
//
//        Map<String,String> mapContent = new Gson().fromJson(content,Map.class);
//        mapContent.forEach((key,value)->System.out.println(key + "::"+value));
//
//        String msisdn = mapContent.get("msisdn");
//        System.out.println("msisdn:[" + msisdn + "]");
//        assertTrue(msisdn != null);
//        assertTrue(msisdn.equals(msisdnRequest));
//
//        String resultDescription = mapContent.get("resultDescription");
//        System.out.println("resultDescription:[" + resultDescription + "]");
//        assertTrue(resultDescription != null);
//        assertTrue(resultDescription.equals(SoSubscriberController.RESULT_DESCRIPTION_400));
//    }


}