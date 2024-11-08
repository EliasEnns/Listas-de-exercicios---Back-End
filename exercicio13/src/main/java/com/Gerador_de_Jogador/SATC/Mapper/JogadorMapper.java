package com.Gerador_de_Jogador.SATC.Mapper;

import com.Gerador_de_Jogador.SATC.Entity.Jogador;
import com.Gerador_de_Jogador.SATC.DTO.JogadorDTO;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(dto.getHabilidade()); // Gera um valor aleatório de habilidade entre 0 e 100.
        return jogador;
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        dto.setHabilidade(jogador.getHabilidade());
        return dto;
    }
}
