package org.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Deixei o Funcionario com erro mesmo por não ter nem uma classe Funcionario no diagrama


public class ContratoLocacao {

    private long id;
    private LocalDate datacontrato;
    private BigDecimal valorcaucao;
    private enum status {
        ATIVO,
        FINALIZADO,
        CANCELADO
    }
    private List<Locacao> locacaos;
    private BigDecimal valortotal;
    //private Funcionario funcionario;
    private Cliente cliente;

    public ContratoLocacao() {
        this.id = 0;
        this.datacontrato = LocalDate.now();
        this.valorcaucao = BigDecimal.ZERO;
        this.valortotal = BigDecimal.ZERO;
        this.locacaos = new ArrayList<>();
        //this.funcionario = new Funcionario();
        this.cliente = new Cliente();
    }

    public ContratoLocacao(long id, LocalDate datacontrato, BigDecimal valorcaucao, List<Locacao> locacaos, BigDecimal valortotal, /*Funcionario funcionario,*/ Cliente cliente) {
        this.id = id;
        this.datacontrato = datacontrato;
        this.valorcaucao = valorcaucao;
        this.locacaos = locacaos;
        this.valortotal = valortotal;
        //this.funcionario = funcionario;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDatacontrato() {
        return datacontrato;
    }

    public void setDatacontrato(LocalDate datacontrato) {
        this.datacontrato = datacontrato;
    }

    public BigDecimal getValorcaucao() {
        return valorcaucao;
    }

    public void setValorcaucao(BigDecimal valorcaucao) {
        this.valorcaucao = valorcaucao;
    }

    public List<Locacao> getLocacaos() {
        return locacaos;
    }

    public void setLocacaos(List<Locacao> locacaos) {
        this.locacaos = locacaos;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }

    /*public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    */
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
