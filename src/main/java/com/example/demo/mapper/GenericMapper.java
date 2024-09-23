package com.example.demo.mapper;

// GenericMapper is a generic abstract class interface used for DI.
public interface GenericMapper<T, TDto> {
    TDto toDto(T entity);
    T toEntity(TDto dto);
}