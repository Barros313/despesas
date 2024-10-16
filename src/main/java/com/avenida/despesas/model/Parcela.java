package com.avenida.despesas.model;

import java.util.Date;

public class Parcela {
    private Date vencimento;
    private String numero;
    private int parcela;
    private double valor;
    private boolean pago;

    public Parcela(Date vencimento, String numero, int parcela, double valor) {
        this.vencimento = vencimento;
        this.numero = numero;
        this.parcela = parcela;
        this.valor = valor;
        this.pago = false;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
