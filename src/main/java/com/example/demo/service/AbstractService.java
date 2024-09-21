package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AbstractEntity;
import com.example.demo.repository.AbstractRepository;

@Service
public abstract class AbstractService<T extends AbstractEntity> {

    @Autowired
    private AbstractRepository<T> repository;

    public T save(T acteur)
    {
        return repository.save(acteur);
    }
    
    public Optional<T> getById(Long id)
    {
        return repository.findById(id);
    }

}