package com.Gerador_de_Jogador.SATC.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document(collection = "jogadores") // Define a coleção no MongoDB
@Data
public class Jogador {
    @Id
    private String id; // Tipo `String` para id automático gerado pelo MongoDB

    private String nome;
    private String apelido;
    private Integer habilidade;
}
