package com.Banco.Back_End.DTO;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {}