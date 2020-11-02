package japa.com.br.model;

import org.hibernate.annotations.LazyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Encontro {

    private Long id;

    private String titulo;

    public Encontro() {
    }

    public Encontro( String titulo) {

        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Encontro setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public Encontro setId(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return  titulo;
    }
}
