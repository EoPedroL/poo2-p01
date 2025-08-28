package org.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Manutencao {
    private long id;
    private String descricao;
    private LocalDate data;
    private BigDecimal custo;
    //+++++++++++++++++++++++++++++++
    // CONSTRUTOR

    public Manutencao() {
        this.id = 0;
        this.descricao = "";
        this.data = LocalDate.now();
        this.custo = BigDecimal.ZERO;
    }

    public Manutencao(long id, String descricao, LocalDate data, BigDecimal custo) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.custo = custo;
    }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

    public BigDecimal getCusto() {

        return custo;
    }

    public void setCusto(BigDecimal custo) {

        this.custo = custo;
    }
}
