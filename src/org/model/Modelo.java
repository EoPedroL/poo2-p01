package org.model;

import java.util.Date;

public class Modelo {

    private long id;
    private String nome;
    private Date anoModelo;
    private int qtModelos;
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    // CONSTRUTORES

    public Modelo() {
        this.id = 0;
        this.nome = "";
        this.anoModelo = new Date();
    }
    public Modelo(long id, String nome, Date anoModelo, int qtModelos) {
        this.id = id;
        this.nome = nome;
        this.anoModelo = anoModelo;
        this.qtModelos = qtModelos;
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

    public Date getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(Date anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQtModelos() {
        return qtModelos;
    }

    public void setQtModelos(int qtModelos) {
        this.qtModelos = qtModelos;
    }
}
