package com.api.conectapps.models.service;

import java.util.List;

import com.api.conectapps.models.entity.Cliente;

public interface ClienteService {
	List<Cliente> findAll();
	Cliente findById(int id);
	void saveData();
}
