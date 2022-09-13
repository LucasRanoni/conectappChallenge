package com.api.conectapps.controller;


import com.api.conectapps.models.service.healt.HealtService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetDatabaseConnectionController {

    @Autowired
    HealtService service;

    @GetMapping("/test")
    @Operation(summary = "Test the database conecction")
    public ResponseEntity getDatabaseConnection(){
            try {
                return new ResponseEntity(service.getStatus(), HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }
}





