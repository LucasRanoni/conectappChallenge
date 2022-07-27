package com.api.conectapps.models.service;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.conectapps.models.dao.ClienteDao;
import com.api.conectapps.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	
    final Logger logger = LogManager.getLogger(ClienteServiceImpl.class);
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired 
	private RestTemplate restTemplate;
	
	@Value("${source.data.url}")
	private String sourceData;
	
	@Override
	public List<Cliente> findAll() {
		try {
			return clienteDao.findAll();
		} catch (Exception e) {
			logger.error("Cannot posible find all clients");
			return null;
		}
	}

	@Override
	public Cliente findById(int id) {
		try {
			return clienteDao.findById(id).orElse(null);
		} catch (Exception e) {
			logger.error("Cannot posible find client by id");
			return null;
		}
	}

	@Override
	public void saveData() {
		try {
			List<Cliente> clientes = Arrays.asList(restTemplate.getForObject(sourceData,Cliente[].class));
			clienteDao.saveAll(clientes);
		} catch (Exception e) {
			logger.error("Cannot posible store client data");
		}
		
	}

}
