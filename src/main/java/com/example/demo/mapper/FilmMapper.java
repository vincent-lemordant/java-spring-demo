package com.example.demo.mapper;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.dto.FilmDto;
import com.example.demo.model.Film;

@Mapper(componentModel = "spring")
public interface FilmMapper extends GenericMapper<Film, FilmDto> {
    @Mapping(target = "acteurs", source = "acteurs")
    @Override
    FilmDto toDto(Film source);
    @Mapping(target = "acteurs", source = "acteurs")
    @Override
    Film toEntity(FilmDto destination);


    // Mapping between list of FilmDto and Film
    List<Film> toEntityList(List<FilmDto> filmDTOs);
    List<FilmDto> toDtoList(List<Film> films);
}