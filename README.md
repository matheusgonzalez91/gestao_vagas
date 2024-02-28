# Sistema de Gestão de Vagas (Spring Boot)

Este é um sistema de gestão de vagas desenvolvido em Spring Boot, utilizando Java 17.0.10 LTS (lançado em 16 de Janeiro de 2024) como base. O projeto emprega uma variedade de ferramentas para oferecer uma solução eficaz e segura.

## Ferramentas Utilizadas

- **IDE**: IntelliJ IDEA
- **Contêiner de Banco de Dados**: Docker (PostgreSQL)
- **Cliente de Banco de Dados**: Postbird
- **Cliente HTTP**: API Dog
- **Segurança**: JWT (JSON Web Token)

## Docker

Para facilitar a execução do banco de dados PostgreSQL em um contêiner Docker, utilizamos o Docker Compose. Abaixo estão os passos básicos para configurar e iniciar o serviço:

1. Crie um arquivo `docker-compose.yml` com o seguinte conteúdo:

```yaml
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

```
- docker-compose up -d é o usado para iniciar contêineres Docker a partir de serviços definidos em um arquivo docker-compose.yml

# Conexão com o Banco de Dados

Para conectar a aplicação Spring Boot ao banco de dados PostgreSQL, as seguintes configurações devem ser especificadas no arquivo de propriedades (application.properties ou application.yml):

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/gestao_vagas
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update

Estas configurações garantem que a aplicação se conecte ao banco de dados PostgreSQL em execução no endereço localhost na porta 5432, utilizando as credenciais de usuário admin e senha admin, e que o Hibernate atualize automaticamente o esquema do banco de dados conforme necessário.
```
