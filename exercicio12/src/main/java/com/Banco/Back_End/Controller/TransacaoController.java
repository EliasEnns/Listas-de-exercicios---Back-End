package com.Banco.Back_End.Controller;

import com.Banco.Back_End.DTO.TransacaoRequestDTO;
import com.Banco.Back_End.DTO.TransacaoResponseDTO;
import com.Banco.Back_End.Services.TransacoesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public TransacaoResponseDTO gerarTransacao(@RequestBody TransacaoRequestDTO transacaoRequestDTO) {
        return transacoesService.realizarTransacao(transacaoRequestDTO);
    }
}
