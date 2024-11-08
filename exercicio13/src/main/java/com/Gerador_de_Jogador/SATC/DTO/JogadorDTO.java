package com.Gerador_de_Jogador.SATC.DTO;

import jakarta.validation.constraints.*;

public class JogadorDTO {
    @NotBlank(message = "O nome não pode ser vazio.")
    private String nome;

    @NotBlank(message = "O apelido não pode ser vazio.")
    private String apelido;

    @NotBlank(message = "A habilidade não pode ser vazia.")
    private String habilidade;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public String getHabilidade() {
        return habilidade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
}