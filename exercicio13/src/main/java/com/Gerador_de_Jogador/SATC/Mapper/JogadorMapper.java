package com.Gerador_de_Jogador.SATC.Mapper;

import com.seuprojeto.entity.Jogador;
import com.seuprojeto.dto.JogadorDTO;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(100); // Valor fixo de habilidade, conforme o exercício.
        return jogador;
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}
