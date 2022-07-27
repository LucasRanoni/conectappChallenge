package com.api.conectapps.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.conectapps.models.entity.Cliente;
import com.api.conectapps.models.service.ClienteService;

@RestController
public class ClienteController {
	
	private static Logger logger = LogManager.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "saveAll")
	public ResponseEntity<Object> saveAllClients(){
		logger.info("Calling saveAll resource ...");
		clienteService.saveData();
		// LLAMADA A LA OTRA API Y GUARDADO DE DATOS
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping(value = "findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> findAll(){
		logger.info("Calling findAll resource ...");
		return clienteService.findAll();
	}
	@GetMapping(value = "findById", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente findById(@RequestParam int id){
		logger.info("Calling findById resource ...");
		return clienteService.findById(id);
	}
	
}
