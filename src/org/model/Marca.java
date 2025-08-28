package org.model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private long id;
    private String nome;
    private List<Modelo> modelos;
    //++++++++++++++++++++++++++++++++++++++++++++++++++++
    //CONSTRUTORES

    public Marca() {
        this.id = 0;
        this.nome = "";
        this.modelos = new ArrayList<>();
    }

    public Marca(long id, String nome, List<Modelo> modelos) {
        this.id = id;
        this.nome = nome;
        this.modelos = modelos;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }
}
