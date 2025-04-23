# Implementação de Autenticação JWT com Spring Boot

Este repositório contém uma implementação de exemplo de autenticação usando JWT (JSON Web Token) em uma API Spring Boot, com suporte a roles para controle de acesso.

## Características

- Autenticação baseada em JWT
- Cadastro de usuários com atribuição automática de roles
- Controle de acesso baseado em roles (ROLE_USER, ROLE_ADMIN)
- Interceptação centralizada de exceções
- Integração com Lombok para redução de código boilerplate

## Estrutura do Projeto

- **Modelo**: Entidades User e enum RoleType
- **Segurança**: Configuração JWT, filtro de autenticação
- **Controladores**: Endpoints para autenticação e recursos protegidos
- **Exceções**: Tratamento global de erros

## Como Executar

1. Clone o repositório
2. Configure o application.properties com suas credenciais de banco de dados
3. Execute o projeto com Maven: `mvn spring-boot:run`

## Endpoints Principais

### Autenticação

- `POST /api/auth/signup` - Registro de novos usuários
- `POST /api/auth/login` - Login e obtenção de token JWT

### Rotas Protegidas

- `GET /api/user/me` - Obter usuário atual (requer autenticação)
- `GET /api/admin/dashboard` - Dashboard do administrador (requer ROLE_ADMIN)

## Uso do Token

Após o login, inclua o token JWT no header de autorização:

```
Authorization: Bearer seu_token_jwt
```

## Tecnologias Utilizadas

- Spring Boot 3.x
- Spring Security
- JWT
- Lombok
- JPA / Hibernate

Este projeto serve como uma referência para implementações de autenticação em aplicações Spring Boot e pode ser adaptado conforme necessário.