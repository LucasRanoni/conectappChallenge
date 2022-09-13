package com.api.conectapps.services.secm;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource( locations = "classpath:test.properties")
class SecmUserValidatorRestTemplateTest {

//    @Autowired
//    ISecmUserValidator secm;
//
//    private static ClientAndServer mockServer;
//
//    @BeforeAll
//    public static void startMockServer() {
//        mockServer = ClientAndServer.startClientAndServer(1080);
//    }
//
//    @AfterAll
//    public static void stopMockServer() {
//        mockServer.stop();
//    }
//
//    @AfterEach
//    public void clearMock() {
//        mockServer.clear(
//                HttpRequest.request()
//        );
//    }
//
//    @Test
//    void validPermission() {
//    }
//
//    @Test
//    void validToken() {
//    }
//
//    @Test
//    public void logoutUserIsOk() throws Exception {
//        mockServer.when(
//                        HttpRequest.request()
//                                .withMethod("GET")
//                                .withPath("/secm/logout")
//                                .withHeader("token", "SECM-01639513237453-9"))
//                .respond(
//                        HttpResponse.response()
//                                .withStatusCode(204));
//
//        secm.logoutUser("SECM-01639513237453-9");
//
//        mockServer.verify(
//                HttpRequest.request().withPath("/secm/logout"),
//                VerificationTimes.exactly(1)
//        );
//    }
//
//    @Test
//    public void logoutUserThrowExceptionInternalServerError() throws Exception {
//        mockServer.when(
//                        HttpRequest.request()
//                                .withMethod("GET")
//                                .withPath("/secm/logout")
//                                .withHeader("token", "SECM-01639513237453-9"))
//                .respond(
//                        HttpResponse.response()
//                                .withStatusCode(500));
//
//        assertThrows(HttpServerErrorException.InternalServerError.class, () -> { secm.logoutUser("SECM-01639513237453-9"); });
//
//        mockServer.verify(
//                HttpRequest.request().withPath("/secm/logout"),
//                VerificationTimes.exactly(1)
//        );
//    }
//
//    @Test
//    public void logoutUserThrowExceptionTimeOut() throws Exception {
//        mockServer.when(
//                        HttpRequest.request()
//                                .withMethod("GET")
//                                .withPath("/secm/logout")
//                                .withHeader("token", "SECM-01639513237453-9"))
//                .respond(
//                        HttpResponse.response()
//                                .withStatusCode(503));
//
//        assertThrows(HttpServerErrorException.ServiceUnavailable.class, () -> { secm.logoutUser("SECM-01639513237453-9"); });
//
//        mockServer.verify(
//                HttpRequest.request().withPath("/secm/logout"),
//                VerificationTimes.exactly(1)
//        );
//    }

}