package com.alkemy.MundoDisney.model;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "personaje")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Double peso;
    private String historia;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "personaje_pelicilaoserie",
            joinColumns = {@JoinColumn(name = "personaje_id")},
            inverseJoinColumns = {@JoinColumn(name = "peliculaOSerie_id")}
    )
    private Set<PeliculaOSerie> peliculasOSeries;

    public Personaje(){}

    public Personaje(String nombre, Double peso, String historia, Set<PeliculaOSerie> peliculasOSeries) {
        this.nombre = nombre;
        this.peso = peso;
        this.historia = historia;
        this.peliculasOSeries = peliculasOSeries;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<PeliculaOSerie> getPeliculaOSerie() {
        return peliculasOSeries;
    }

    public void setPeliculaOSerie(Set<PeliculaOSerie> peliculaOSerie) {
        this.peliculasOSeries = peliculaOSerie;
    }
}
