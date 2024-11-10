package com.Banco.Back_End.Models;

public class Conta {
    private String codigo;
    private String cliente;
    private Double saldo;

    public Conta(String codigo, String cliente, Double saldo) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}