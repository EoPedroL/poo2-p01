package org.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private long id;
    private String nome;
    private BigDecimal valorlocacao;
    private List<Modelo> modelos;

    public Categoria() {
        this.id = 0;
        this.nome = "";
        this.valorlocacao = BigDecimal.ZERO;
        this.modelos = new ArrayList<>();
    }

    public Categoria(long id, BigDecimal valorlocacao, String nome, List<Modelo> modelos) {
        this.id = id;
        this.valorlocacao = valorlocacao;
        this.nome = nome;
        this.modelos = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    public BigDecimal getValorlocacao() {
        return valorlocacao;
    }

    public void setValorlocacao(BigDecimal valorlocacao) {
        this.valorlocacao = valorlocacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
