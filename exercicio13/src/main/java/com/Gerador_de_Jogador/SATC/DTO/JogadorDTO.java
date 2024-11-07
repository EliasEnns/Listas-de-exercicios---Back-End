package com.Gerador_de_Jogador.SATC.DTO;

import jakarta.validation.constraints.*;

public class JogadorDTO {
    @NotBlank(message = "O nome não pode ser vazio.")
    private String nome;

    @NotBlank(message = "O apelido não pode ser vazio.")
    private String apelido;

    // Getters e Setters
}
