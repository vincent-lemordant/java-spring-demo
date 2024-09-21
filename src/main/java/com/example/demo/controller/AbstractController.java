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
public abstract class AbstractController<T extends AbstractEntity, TDto> {

    @Autowired
    private AbstractService<T> service;
    @Autowired
    private GenericMapper<T, TDto> mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TDto saveFilm(@RequestBody TDto film)
    {
        return mapper.toDto(service.save(mapper.toEntity(film)));
    }

    @GetMapping("/{id}")
    public TDto fetchFilmList(@PathVariable("id") Long id)
    {
        return mapper.toDto(service.getById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
}