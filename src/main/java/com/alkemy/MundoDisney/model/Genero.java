package com.alkemy.MundoDisney.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "peicilaOSerie_id")
    private List<PeliculaOSerie> peliculasOSeries;

    public Genero(){}

    public Genero(String nombre, List<PeliculaOSerie> peliculasOSeries) {
        this.nombre = nombre;
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

    public List<PeliculaOSerie> getPeliculasOSeries() {
        return peliculasOSeries;
    }

    public void setPeliculasOSeries(List<PeliculaOSerie> peliculasOSeries) {
        this.peliculasOSeries = peliculasOSeries;
    }
}
