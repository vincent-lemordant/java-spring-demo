package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ActeurDto;
import com.example.demo.model.Acteur;

@RestController
@RequestMapping("/acteurs")
public class ActeurController extends AbstractController<Acteur, ActeurDto> {
}