# Arquitetura do Pulse Engine

O sistema é modularizado em múltiplos subprojetos:

- API: Camada de exposição REST
- Core: Regras de negócio e serviços
- Infra: Camada de persistência
- Common: Entidades e objetos compartilhados

Fluxo de requisição:
1. Controller recebe input via REST
2. Service executa lógica
3. Repository grava ou lê dados
4. Retorno formatado via DTO
