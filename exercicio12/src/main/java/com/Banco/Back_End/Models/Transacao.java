package com.Banco.Back_End.Models;

public class Transacao {
    private Conta origem;
    private Conta destino;
    private Double valor;

    public Transacao(Conta origem, Conta destino, Double valor) {
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
    }

    // Getters
    public Conta getOrigem() {
        return origem;
    }

    public Conta getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }

    // Setters
    public void setOrigem(Conta origem) {
        this.origem = origem;
    }

    public void setDestino(Conta destino) {
        this.destino = destino;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}