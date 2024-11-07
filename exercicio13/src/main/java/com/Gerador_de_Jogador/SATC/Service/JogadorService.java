package com.Gerador_de_Jogador.SATC.Service;

import com.seuprojeto.dto.JogadorDTO;
import com.seuprojeto.entity.Jogador;
import com.seuprojeto.mapper.JogadorMapper;
import com.seuprojeto.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    public JogadorDTO salvarJogador(JogadorDTO dto) {
        Jogador jogador = JogadorMapper.toEntity(dto);
        jogador = jogadorRepository.save(jogador);
        return JogadorMapper.toDTO(jogador);
    }

    public List<JogadorDTO> listarJogadores() {
        return jogadorRepository.findAll().stream()
                .map(JogadorMapper::toDTO)
                .collect(Collectors.toList());
    }
}
