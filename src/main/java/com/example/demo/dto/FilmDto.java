package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto implements Serializable {
    private Long id;
    private String titre;
    private String description;
    private List<ActeurDto> acteurs = new ArrayList<>();;
}