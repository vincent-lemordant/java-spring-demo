package com.example.demo.mapper;

public interface GenericMapper<T, TDto> {
    TDto toDto(T entity);
    T toEntity(TDto dto);
}