Sistema de Gestão de Vagas (Spring Boot)

- Java version: java 17.0.10 2024-01-16 LTS

Ferramentas utilizadas:

- InteliJ
- Docker (PostgreSQL)
- API Dog (HTTP Request)

Utilizei o JWT para gerar o token para o usuário e manter a segurança do projeto


# Docker
Caso não saiba como funciona uma estrutura #DOCKER é basicamente assim:

// Criar arquivo docker-compose.yml
services:
  postgres:
    container_name: gestao_vagas_postgres
    image: postgres
    ports:
      - 5432:5432
    environment:
      - POSTGRES_USER=admin
      - POSTGRES_PASSWORD=admin
      - POSTGRES_DB=gestao_vagas

- docker-compose up -d é o usado para iniciar contêineres Docker a partir de serviços definidos em um arquivo docker-compose.yml
