package org.model;

import java.math.BigDecimal;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

//Deixei a Ocorrencia com erro mesmo por não ter nem uma classe Ocorrencia no diagrama

public class Locacao {

    private long id;
    private LocalDate dataretirada;
    private LocalDate datadevolucao;
    private BigDecimal valorlocacao;
    //private List<Ocorrencia> ocorrencias;
    private Veiculo veiculo;

    public Locacao() {
        this.id = 0;
        this.dataretirada = LocalDate.now();
        this.datadevolucao = LocalDate.now();
        this.valorlocacao = BigDecimal.ZERO;
        //this.ocorrencias = new ArrayList<>();
        this.veiculo = new Veiculo();
    }

    public Locacao(long id, LocalDate dataretirada, LocalDate datadevolucao, BigDecimal valorlocacao, /*List<Ocorrencia> ocorrencias,*/ Veiculo veiculo) {
        this.id = id;
        this.dataretirada = dataretirada;
        this.datadevolucao = datadevolucao;
        this.valorlocacao = valorlocacao;
        //this.ocorrencias = new ArrayList<>();
        this.veiculo = veiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataretirada() {
        return dataretirada;
    }

    public void setDataretirada(LocalDate dataretirada) {
        this.dataretirada = dataretirada;
    }

    public LocalDate getDatadevolucao() {
        return datadevolucao;
    }

    public void setDatadevolucao(LocalDate datadevolucao) {
        this.datadevolucao = datadevolucao;
    }

    public BigDecimal getValorlocacao() {
        return valorlocacao;
    }

    public void setValorlocacao(BigDecimal valorlocacao) {
        this.valorlocacao = valorlocacao;
    }

    /*public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
