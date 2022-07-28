package com.api.conectapps.models.service;

import java.util.List;

import com.api.conectapps.models.entity.Client;

public interface ClientService {
	List<Client> findAll();
	Client findById(int id);
	void saveData();
}
