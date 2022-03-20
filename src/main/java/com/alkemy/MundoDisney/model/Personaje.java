package com.alkemy.MundoDisney.model;

import javax.persistence.Entity;


@Entity
public class Personaje {

    private Integer id;
    private String nombre;
    private Double peso;
    private String historia;
    private PeliculaOSerie peliculaOSerie;


}
