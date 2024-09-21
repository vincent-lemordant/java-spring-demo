package com.example.demo.mapper;
import org.mapstruct.Mapper;

import com.example.demo.dto.ActeurDto;
import com.example.demo.model.Acteur;

@Mapper(componentModel = "spring")
public interface ActeurMapper extends GenericMapper<Acteur, ActeurDto> {
    @Override
    ActeurDto toDto(Acteur entity);
    @Override
    Acteur toEntity(ActeurDto dto);
}