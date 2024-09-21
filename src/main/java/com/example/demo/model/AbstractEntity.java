package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Entity
@Getter @Setter
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractEntity implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
}