package com.elias.Jogador_Generator.Controllers;

import com.elias.Jogador_Generator.dto.JogadorRequestDTO;
import com.elias.Jogador_Generator.dto.JogadorResponseDTO;
import com.elias.Jogador_Generator.Services.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    private final JogadorService jogadorService;

    @Autowired
    public JogadorController(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @PostMapping
    public JogadorResponseDTO criarJogador(@RequestBody JogadorRequestDTO jogadorRequestDTO) {
        return jogadorService.criarJogador(jogadorRequestDTO);
    }

    @GetMapping
    public List<JogadorResponseDTO> obterTodosJogadores() {
        return jogadorService.obterTodosJogadores();
    }
}
