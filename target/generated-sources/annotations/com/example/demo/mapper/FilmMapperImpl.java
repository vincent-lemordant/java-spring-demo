package com.example.demo.mapper;

import com.example.demo.dto.ActeurDto;
import com.example.demo.dto.FilmDto;
import com.example.demo.model.Acteur;
import com.example.demo.model.Film;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-21T16:18:21-0400",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class FilmMapperImpl implements FilmMapper {

    @Override
    public FilmDto toDto(Film source) {
        if ( source == null ) {
            return null;
        }

        FilmDto filmDto = new FilmDto();

        filmDto.setActeurs( acteurListToActeurDtoList( source.getActeurs() ) );
        filmDto.setDescription( source.getDescription() );
        filmDto.setId( source.getId() );
        filmDto.setTitre( source.getTitre() );

        return filmDto;
    }

    @Override
    public Film toEntity(FilmDto destination) {
        if ( destination == null ) {
            return null;
        }

        Film.FilmBuilder film = Film.builder();

        film.acteurs( acteurDtoListToActeurList( destination.getActeurs() ) );
        film.description( destination.getDescription() );
        film.titre( destination.getTitre() );

        return film.build();
    }

    protected ActeurDto acteurToActeurDto(Acteur acteur) {
        if ( acteur == null ) {
            return null;
        }

        ActeurDto acteurDto = new ActeurDto();

        acteurDto.setId( acteur.getId() );
        acteurDto.setNom( acteur.getNom() );
        acteurDto.setPrenom( acteur.getPrenom() );

        return acteurDto;
    }

    protected List<ActeurDto> acteurListToActeurDtoList(List<Acteur> list) {
        if ( list == null ) {
            return null;
        }

        List<ActeurDto> list1 = new ArrayList<ActeurDto>( list.size() );
        for ( Acteur acteur : list ) {
            list1.add( acteurToActeurDto( acteur ) );
        }

        return list1;
    }

    protected Acteur acteurDtoToActeur(ActeurDto acteurDto) {
        if ( acteurDto == null ) {
            return null;
        }

        Acteur acteur = new Acteur();

        acteur.setId( acteurDto.getId() );
        acteur.setNom( acteurDto.getNom() );
        acteur.setPrenom( acteurDto.getPrenom() );

        return acteur;
    }

    protected List<Acteur> acteurDtoListToActeurList(List<ActeurDto> list) {
        if ( list == null ) {
            return null;
        }

        List<Acteur> list1 = new ArrayList<Acteur>( list.size() );
        for ( ActeurDto acteurDto : list ) {
            list1.add( acteurDtoToActeur( acteurDto ) );
        }

        return list1;
    }
}
