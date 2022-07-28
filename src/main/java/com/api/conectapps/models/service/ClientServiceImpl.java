package com.api.conectapps.models.service;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.conectapps.models.dao.ClientDao;
import com.api.conectapps.models.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {
	
    final Logger logger = LogManager.getLogger(ClientServiceImpl.class);
	
	@Autowired
	private ClientDao clientDao;
	
	@Autowired 
	private RestTemplate restTemplate;
	
	@Value("${source.data.url}")
	private String sourceData;
	
	@Override
	public List<Client> findAll() {
		try {
			logger.info("Getting all customers");
			return clientDao.findAll();
		} catch (Exception e) {
			logger.error("Cannot posible find all customers ERROR: {}", e);
			return null;
		}
	}

	@Override
	public Client findById(int id) {
		try {
			logger.info("Get customer by id : {}" , id);
			return clientDao.findById(id).orElse(null);
		} catch (Exception e) {
			logger.error("Cannot posible find customers by id ERROR: {}", e);
			return null;
		}
	}

	@Override
	public void saveData() {
		try {
			logger.info("Calling api {}", sourceData);
			List<Client> clients = Arrays.asList(restTemplate.getForObject(sourceData, Client[].class));
			clientDao.saveAll(clients);
			logger.info("Information was saved correctly");
		} catch (Exception e) {
			logger.error("It was not possible to obtain the information ERROR: {}", e);
		}
		
	}

}
