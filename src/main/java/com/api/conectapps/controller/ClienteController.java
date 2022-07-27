package com.api.conectapps.controller;

import java.util.List;
import java.util.MissingResourceException;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.*;

import com.api.conectapps.models.entity.Cliente;
import com.api.conectapps.models.service.ClienteService;
import org.springframework.web.server.MethodNotAllowedException;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ClienteController {
	
	static Logger LOGGER = LogManager.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService clienteService;

	@PostMapping(value = "customers")
	public ResponseEntity<Object> saveAllClients(){
		LOGGER.info("Calling POST customers ...");
		clienteService.saveData();
		// LLAMADA A LA OTRA API Y GUARDADO DE DATOS
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value = "customers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> findAll(){
		LOGGER.info("Calling GET customers ...");
		return clienteService.findAll();
	}
	@GetMapping(value = "customers/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente findById(@PathVariable int id){
		LOGGER.info("Calling GET customers by id ...");
		return clienteService.findById(id);
	}

	@ExceptionHandler(value =  {MissingRequestHeaderException.class, MissingPathVariableException.class
			, MissingResourceException.class , HttpMessageNotReadableException.class,
			MethodNotAllowedException.class, HttpRequestMethodNotSupportedException.class})
	public ResponseEntity handleRequestException(HttpServletRequest request) {
			return new ResponseEntity<>("Resource was not found, try : customers - customers/1",HttpStatus.BAD_REQUEST);
	}
	
}
