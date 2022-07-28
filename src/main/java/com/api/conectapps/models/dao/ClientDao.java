package com.api.conectapps.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.conectapps.models.entity.Client;

public interface ClientDao extends JpaRepository<Client, Integer> {
}
