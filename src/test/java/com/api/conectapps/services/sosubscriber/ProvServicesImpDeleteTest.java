package com.api.conectapps.services.sosubscriber;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource( locations = "classpath:test.properties")
@Sql("classpath:test.sql")
class ProvServicesImpDeleteTest {

//    @Autowired
//    ProvServices service;
//
//    @Test
//    void deleteIsOk() {
//        try{
//            int result = service.delete("123456");
//            assertEquals(2, result);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
    
}