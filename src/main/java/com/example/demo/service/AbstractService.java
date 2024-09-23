package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AbstractEntity;
import com.example.demo.repository.AbstractRepository;

@Service
// AbstractService is a generic abstract class designed to handle common
// business logic operations for entities extending AbstractEntity.
public abstract class AbstractService<T extends AbstractEntity> {

    @Autowired
    private AbstractRepository<T> repository;

    public T save(T entity)
    {
        return repository.save(entity);
    }
    
    public Optional<T> getById(Long id)
    {
        return repository.findById(id);
    }

}