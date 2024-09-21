package com.example.demo.mapper;

import com.example.demo.dto.ActeurDto;
import com.example.demo.model.Acteur;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-09-21T16:18:20-0400",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.39.0.v20240820-0604, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class ActeurMapperImpl implements ActeurMapper {

    @Override
    public ActeurDto toDto(Acteur entity) {
        if ( entity == null ) {
            return null;
        }

        ActeurDto acteurDto = new ActeurDto();

        acteurDto.setId( entity.getId() );
        acteurDto.setNom( entity.getNom() );
        acteurDto.setPrenom( entity.getPrenom() );

        return acteurDto;
    }

    @Override
    public Acteur toEntity(ActeurDto dto) {
        if ( dto == null ) {
            return null;
        }

        Acteur acteur = new Acteur();

        acteur.setId( dto.getId() );
        acteur.setNom( dto.getNom() );
        acteur.setPrenom( dto.getPrenom() );

        return acteur;
    }
}
