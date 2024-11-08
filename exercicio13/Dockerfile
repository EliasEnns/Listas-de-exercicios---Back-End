# Usando a imagem base do OpenJDK 17 (versão leve Alpine)
FROM openjdk:17-jdk-alpine

# Definindo o diretório de trabalho dentro do container
WORKDIR /app

# Copiando o arquivo .jar gerado para dentro do container
COPY target/SATC-1.0.jar /app/Gerador_de_Jogador.jar

# Expondo a porta 8080 (padrão para web services)
EXPOSE 8080

# Comando de inicialização para rodar o .jar
ENTRYPOINT ["java", "-jar", "Gerador_de_Jogador.jar"]