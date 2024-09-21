package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FilmDto;
import com.example.demo.model.Film;

@RestController
@RequestMapping("/films")
public class FilmController extends AbstractController<Film, FilmDto> {
}