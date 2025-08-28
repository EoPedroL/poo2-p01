package org.model;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Modelo {

    private long id;
    private String nome;
    private LocalDate anoModelo;
    private int qtModelos;
    private List<Veiculo> veiculos;
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // CONSTRUTORES

    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.anoModelo = LocalDate.now();
        this.veiculos = new ArrayList<>();
    }
    public Modelo(long id, String nome, LocalDate anoModelo, int qtModelos) {
        this.id = id;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.qtModelos = qtModelos;
        this.veiculos = new ArrayList<>();
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++


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

    public LocalDate getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(LocalDate anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQtModelos() {
        return qtModelos;
    }

    public void setQtModelos(int qtModelos) {
        this.qtModelos = qtModelos;
    }

    public List<Veiculo> getVeiculo() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
}

