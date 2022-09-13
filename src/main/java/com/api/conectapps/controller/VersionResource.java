package com.api.conectapps.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.headers.Header;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@PropertySource("classpath:version.properties")
public class VersionResource {

    @Value("${VERSION}")
    private String version;

    @GetMapping("/about")
    @Operation(summary = "Create a new Subscriber",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Transaction successfully executed.",
                            content = @Content(mediaType = "application/json",
                                    examples = {@ExampleObject(value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"Transaction successfully executed.\" }")}),headers = @Header(name = "correlationId", description = "send the received correlationId")),
                    @ApiResponse(responseCode = "400", description = "Invalid request format.",
                            content = @Content(mediaType = "application/json",
                                    examples = {@ExampleObject(value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"Invalid request format.\" }")}),headers = @Header(name = "correlationId", description = "send the received correlationId")),
                    @ApiResponse(responseCode = "401", description = "Expired/Invalid Token.",
                            content = @Content(mediaType = "application/json",
                                    examples = {@ExampleObject(value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"Expired/Invalid Token.\" }")}),headers = @Header(name = "correlationId", description = "send the received correlationId")),
                    @ApiResponse(responseCode = "403", description = "Insufficient permissions.",
                            content = @Content(mediaType = "application/json",
                                    examples = {@ExampleObject(value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"Insufficient permissions.\" }")}),headers = @Header(name = "correlationId", description = "send the received correlationId")),
                    @ApiResponse(responseCode = "409",
                            content = @Content(mediaType = "application/json",
                                    examples = {
                                            @ExampleObject(name = "repeated soProvProfileId", value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"At least one repeated soProvProfileId detected in the received list. The entire transaction was rolled back.\" }"),
                                            @ExampleObject(name = "unknown soProvProfileId", value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"At least one unknown soProvProfileId detected. The entire transaction was rolled back.\" }"),
                                            @ExampleObject(name = "MSISDN exists", value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"MSISDN already exists.\" }")}
                            ),headers = @Header(name = "correlationId", description = "send the received correlationId")),
                    @ApiResponse(responseCode = "500", description = "Unexpected error.",
                            content = @Content(mediaType = "application/json",
                                    examples = {@ExampleObject(value = "{ \"msisdn\": \"<msisdn_value – format (CC+NDC+SN)>\", \"resultDescription\": \"Unexpected error: < Error description>\" }")}),headers = @Header(name = "correlationId", description = "send the received correlationId")),
            })
    public ResponseEntity getVersion() {
        return new ResponseEntity(version, HttpStatus.OK);
    }
}
