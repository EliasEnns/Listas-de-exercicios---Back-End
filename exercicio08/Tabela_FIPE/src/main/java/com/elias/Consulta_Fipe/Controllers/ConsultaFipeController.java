package com.elias.Consulta_Fipe.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@RestController
@RequestMapping("/api/fipe")
public class ConsultaFipeController {

    @PostMapping("/consulta")
    public CarResponse consultaFipe(@RequestBody CarRequest carRequest) { // Consertar requestbody
        String url = "https://fipe.online/cars/brands/" + carRequest.getMarca() + "/models/" + carRequest.getModelo() + "/years/" + carRequest.getAno() + "?format=json";
        
        RestTemplate restTemplate = new RestTemplate();
        
        // Set up headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Subscription-Token", "meu_token");
        headers.set("Accept", "application/json");

        // Create an HttpEntity with the headers
        HttpEntity<String> entity = new HttpEntity<>(headers);
        
        // Make the request
        ResponseEntity<FipeResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, FipeResponse.class);
        
        FipeResponse fipeResponse = response.getBody();
        return new CarResponse(fipeResponse.getValor(), fipeResponse.getMes());
    }
}

class CarRequest {
    private String marca;
    private String modelo;
    private int ano;

    // Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

class CarResponse {
    private double valor;
    private String mes;

    public CarResponse(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    // Getters and Setters
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}

class FipeResponse {
    private double Valor;
    private String Mes;

    // Getters and Setters
    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }
}