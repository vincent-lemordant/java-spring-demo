package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.mapper.GenericMapper;
import com.example.demo.model.AbstractEntity;
import com.example.demo.service.AbstractService;

@RestController
// AbstractController is a generic abstract class designed to handle common API
// operations for entities extending AbstractEntity and their corresponding DTO types.
public abstract class AbstractController<T extends AbstractEntity, TDto> {

    @Autowired
    private AbstractService<T> service;
    @Autowired
    private GenericMapper<T, TDto> mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TDto save(@RequestBody TDto dto)
    {
        return mapper.toDto(service.save(mapper.toEntity(dto)));
    }

    @GetMapping("/{id}")
    public TDto fetchList(@PathVariable("id") Long id)
    {
        return mapper.toDto(service.getById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}