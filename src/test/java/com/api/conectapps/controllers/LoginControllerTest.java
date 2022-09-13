package com.api.conectapps.controllers;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

//@Import(ConfigSecmLoginControllerTest.class)
@ActiveProfiles(value = "ConfigSecmLoginControllerTest")

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
@TestPropertySource(locations="classpath:test.properties")
class LoginControllerTest {

//    @Autowired
//    private MockMvc mockMvc;
//
//    // LOGIN BAD REQUEST (STATUS 400)
//    @Test
//    public void testLoginBadRequest() throws Exception {
//        this.mockMvc.perform(post("/login")
//                .header("user","ADMIN")
//                .header("password", "ADMIN3")
//                .header("correlationId","ProyectSOPA"))
//                .andDo(print()).
//                andExpect(status().isBadRequest());
//    }
//
//    // LOGIN UNPROCESSABLE ENTITY (STATUS 422)
//    @Test
//    public void testLoginUnprocessableEntity() throws  Exception {
//        this.mockMvc.perform(post("/login")
//                .header("user", "ADMIN")
//                .header("password", "ADMIN3")
//                .header("organization","")
//                .header("correlationId","ProjectSOPA"))
//                .andDo(print())
//                .andExpect(status().isUnprocessableEntity());
//    }
//
//    // LOGIN OK (STATUS 200)
//    @Test
//    public void testLoginIsOk() throws Exception {
//        this.mockMvc.perform(post("/login")
//                .header("user", ConfigSecmLoginControllerTest.User)
//                .header("password", "ADMIN3")
//                .header("organization","0")
//                .header("correlationId","ProjectSOPA"))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//    // LOGIN FORBIDDEN (STATUS 403)
//    @Test
//    public void testLoginForbidden() throws Exception {
//        this.mockMvc.perform(post("/login")
//                .header("user", ConfigSecmLoginControllerTest.InvalidUser)
//                .header("password", "ADMIN3")
//                .header("organization","0")
//                .header("correlationId","ProjectSOPA"))
//                .andDo(print())
//                .andExpect(status().isForbidden());
//    }
//
//    // LOGIN INTERNAL SERVER ERROR (STATUS 500)
//    @Test
//    public void testLoginInternalServerError() throws Exception {
//        this.mockMvc.perform(post("/login")
//                        .header("user", ConfigSecmLoginControllerTest.errorUser)
//                        .header("password", "ADMIN3")
//                        .header("organization","0")
//                        .header("correlationId","ProjectSOPA"))
//                .andDo(print())
//                .andExpect(status().isInternalServerError());
//    }
}
