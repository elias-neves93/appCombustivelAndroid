package br.uninove.combustivel.combustivel;

import java.io.Serializable;

/**
 * Created by elias on 05/04/17.
 */

public class Cotacao implements Serializable {
    private double valorGasolina;
    private double valorAlcool;


    public double getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(double valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public double getValorAlcool() {
        return valorAlcool;
    }

    public void setValorAlcool(double valorAlcool) {
        this.valorAlcool = valorAlcool;
    }
}
