package com.api.conectapps.models.service.healt;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class HealtServiceImpl implements HealtService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public String getStatus() throws Exception{
        try {
            entityManager.createNativeQuery("select 1").getSingleResult();
        } finally {
            if (entityManager != null) entityManager.close();
        }
        return "OK";
    }
}
