package com.Banco.Back_End.Mappers;

import com.Banco.Back_End.DTO.ContaDTO;
import com.Banco.Back_End.Models.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }

    public static Conta toEntity(ContaDTO contaDTO) {
        return new Conta(contaDTO.codigo(), contaDTO.cliente(), 0.0);
    }
}