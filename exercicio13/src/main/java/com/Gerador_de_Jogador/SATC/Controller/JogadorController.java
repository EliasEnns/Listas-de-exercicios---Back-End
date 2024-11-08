package com.Gerador_de_Jogador.SATC.Controller;

import com.Gerador_de_Jogador.SATC.DTO.JogadorDTO;
import com.Gerador_de_Jogador.SATC.Service.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @PostMapping
    public ResponseEntity<JogadorDTO> criarJogador(@Valid @RequestBody JogadorDTO jogadorDTO) {
        JogadorDTO novoJogador = jogadorService.salvarJogador(jogadorDTO);
        return ResponseEntity.ok(novoJogador);
    }

    @GetMapping
    public ResponseEntity<List<JogadorDTO>> listarJogadores() {
        List<JogadorDTO> jogadores = jogadorService.listarJogadores();
        return ResponseEntity.ok(jogadores);
    }
}
