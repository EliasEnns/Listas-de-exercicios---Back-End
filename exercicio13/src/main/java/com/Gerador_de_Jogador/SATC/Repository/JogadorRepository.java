package com.Gerador_de_Jogador.SATC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gerador_de_Jogador.SATC.Entity.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    // Custom query methods, if needed
}
