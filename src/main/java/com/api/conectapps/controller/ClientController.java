package com.api.conectapps.controller;

import com.api.conectapps.models.entity.Client;
import com.api.conectapps.models.service.ClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.MethodNotAllowedException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.MissingResourceException;

@RestController
public class ClientController {
	
	static Logger LOGGER = LogManager.getLogger(ClientController.class);
	
	@Autowired
	private ClientService clientService;

	@PostMapping(value = "customers")
	public ResponseEntity<Object> saveAllClients(){
		LOGGER.info("Calling POST customers ...");
		clientService.saveData();
		// LLAMADA A LA OTRA API Y GUARDADO DE DATOS
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value = "customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Client> findAll(){
		LOGGER.info("Calling GET customers ...");
		return clientService.findAll();
	}
	@GetMapping(value = "customers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Client findById(@PathVariable int id){
		LOGGER.info("Calling GET customers by id ...");
		return clientService.findById(id);
	}

	@ExceptionHandler(value =  {MissingRequestHeaderException.class, MissingPathVariableException.class
			, MissingResourceException.class , HttpMessageNotReadableException.class,
			MethodNotAllowedException.class, HttpRequestMethodNotSupportedException.class})
	public ResponseEntity handleRequestException(HttpServletRequest request) {
			return new ResponseEntity<>("Resource was not found, try : customers - customers/1",HttpStatus.BAD_REQUEST);
	}
	
}
