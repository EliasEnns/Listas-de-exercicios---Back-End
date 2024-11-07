package com.Gerador_de_Jogador.SATC.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.seuprojeto.entity.Jogador;

public interface JogadorRepository extends MongoRepository<Jogador, String> {
}
