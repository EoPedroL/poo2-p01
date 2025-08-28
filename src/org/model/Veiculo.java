package org.model;

import java.util.ArrayList;
import java.util.Date;

public class Veiculo {

    private long id;
    private enum Status{
        DISPONIVEL,
        EM_MANUTENCAO,
        VENDIDO,
        INDISPONIVEL
    }
    private int km;
    private String placa;
    private String chassi;
    private String renavam;
    private String cor;
    private Modelo modelo;

    public Veiculo() {
        this.id = 0;
        this.placa = "";
        this.chassi = "";
        this.renavam = "";
        this.cor = "";
        this.modelo = new Modelo();
    }
    public Veiculo(long id, int km, String placa, String chassi, String renavam, String cor, Modelo modelo) {
        this.id = id;
        this.km = km;
        this.placa = placa;
        this.chassi = chassi;
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}
