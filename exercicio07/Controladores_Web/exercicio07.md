# Exercício 07: Controladores Web

## Objetivo

Utilizando o framework Spring Web, implemente um controlador que receba uma entrada por query strings e retorne uma resposta. Utilize um dos exercícios propostos anteriores como base.

> Exemplo: Um controlador que recebe duas query strings com genero e ambientação e retorna uma sugestão de filme (como no [exercício 01](./exercicio01.md)).

## Instruções

* Crie um novo projeto Spring Boot usando o Spring Initializr.
* Defina uma classe de controlador com a anotação `@RestController`.
* Crie um método que receba uma entrada por query strings e retorne uma resposta.


## Entradas (inputs)

````txt
http://localhost:8080/recomendar?genero=acao&ambiente=futurista
````

## Saídas (outputs)

````txt
Homens de Preto
````


# Minha resposta:

## Criação do projeto no Spring Boot Initializer

https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.3.5&packaging=jar&jvmVersion=17&groupId=com.elias&artifactId=exercicio&name=controlador_web&description=controlador%20que%20recebe%20uma%20entrada%20por%20query%20strings%20e%20retorna%20uma%20resposta&packageName=com.elias.exercicio&dependencies=web,devtools,docker-compose


## Entradas (inputs)

http://localhost:8080/api/divisao?a=600000&b=2

## Saídas (outputs)

````txt
300000.0
````
