package com.api.conectapps.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.conectapps.models.entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {

}
