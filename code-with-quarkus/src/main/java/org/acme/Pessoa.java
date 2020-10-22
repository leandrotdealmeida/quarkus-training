package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Pessoa extends PanacheEntity {

    private String nome;

    private Long idade;

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Long getIdade() {
        return idade;
    }

    public Pessoa setIdade(Long idade) {
        this.idade = idade;
        return this;
    }

    public List<Pessoa> listarPessoas() {
        return listAll();
    }
}