package com.example.demo.mapper;
import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.ActeurDto;
import com.example.demo.model.Acteur;

@Mapper(componentModel = "spring")
public interface ActeurMapper extends GenericMapper<Acteur, ActeurDto> {
    @Override
    ActeurDto toDto(Acteur entity);
    @Override
    Acteur toEntity(ActeurDto dto);

    // Mapping between list of ActeurDto and Acteur
    List<Acteur> toEntityList(List<ActeurDto> ActeurDtos);
    List<ActeurDto> toDtoList(List<Acteur> films);
}