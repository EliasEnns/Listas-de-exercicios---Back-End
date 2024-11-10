package com.Banco.Back_End.Services;

import com.Banco.Back_End.Models.Conta;
import com.Banco.Back_End.DTO.TransacaoRequestDTO;
import com.Banco.Back_End.DTO.TransacaoResponseDTO;
import com.Banco.Back_End.Mappers.ContaMapper;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransacoesService {
    private List<Conta> contas = new ArrayList<>();

    public TransacoesService() {
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 500.0));
    }

    public TransacaoResponseDTO realizarTransacao(TransacaoRequestDTO requestDTO) {
        Conta origem = buscarContaPorCodigo(requestDTO.origem())
            .orElseThrow(() -> new IllegalArgumentException("Conta de origem não encontrada"));
        Conta destino = buscarContaPorCodigo(requestDTO.destino())
            .orElseThrow(() -> new IllegalArgumentException("Conta de destino não encontrada"));

        if (origem.getSaldo() < requestDTO.valor()) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        origem.setSaldo(origem.getSaldo() - requestDTO.valor());
        destino.setSaldo(destino.getSaldo() + requestDTO.valor());

        return new TransacaoResponseDTO(
            ContaMapper.toDTO(origem),
            ContaMapper.toDTO(destino),
            requestDTO.valor()
        );
    }

    private Optional<Conta> buscarContaPorCodigo(String codigo) {
        return contas.stream()
            .filter(conta -> conta.getCodigo().equals(codigo))
            .findFirst();
    }
}