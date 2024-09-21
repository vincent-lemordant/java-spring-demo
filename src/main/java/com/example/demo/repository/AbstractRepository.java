package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.AbstractEntity;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AbstractRepository<T extends AbstractEntity> extends CrudRepository<T, Long> {
}