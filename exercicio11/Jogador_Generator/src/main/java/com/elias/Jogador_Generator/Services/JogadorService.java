package com.elias.Jogador_Generator.Services;

import com.elias.Jogador_Generator.dto.JogadorRequestDTO;
import com.elias.Jogador_Generator.dto.JogadorResponseDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    private final List<JogadorResponseDTO> jogadores = new ArrayList<>();
    private final Random random = new Random();

    public JogadorResponseDTO criarJogador(JogadorRequestDTO requestDTO) {
        int habilidade = random.nextInt(101);  // Gera um número entre 0 e 100
        String statusMessage = habilidade > 50 ? "Habilidoso" : "Iniciante";
        
        JogadorResponseDTO responseDTO = new JogadorResponseDTO(
            requestDTO.nome(),
            requestDTO.apelido(),
            habilidade,
            statusMessage
        );
        
        jogadores.add(responseDTO);  // Armazena o jogador na lista
        return responseDTO;
    }

    public List<JogadorResponseDTO> obterTodosJogadores() {
        return jogadores;
    }
}