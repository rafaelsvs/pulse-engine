# 🚀 Pulse Engine

Plataforma de simulação e registro de incentivos em tempo real — ideal para testar motores de precificação, mecanismos de feedback e decisões operacionais automatizadas.

## 🧠 Visão Geral

O Pulse Engine é um projeto modular com foco em:

- Geração de incentivos baseados em múltiplos sinais
- Registro de feedbacks de aceitação ou rejeição
- Persistência e visualização via API REST
- Extensibilidade para motores de decisão mais sofisticados (ex: A/B, ML)

## 📦 Módulos

| Módulo             | Descrição                                     |
|--------------------|-----------------------------------------------|
| `pulse-engine-api` | Exposição de endpoints REST                  |
| `pulse-engine-core`| Lógica de negócio (serviços, DTOs, regras)   |
| `pulse-engine-infra` | Persistência com JPA/Postgres              |
| `pulse-engine-common` | Entidades e objetos compartilhados        |
| `pulse-engine-test`| Scripts e simulações para testes locais      |

## ⚙️ Setup Local

```bash
git clone https://github.com/seu-usuario/pulse-engine.git
cd pulse-engine
docker-compose up --build
```

## 🗃️ Banco de Dados

O schema padrão está em `docs/database-schema.sql`.

## 🧪 Testes

```bash
mvn clean test
```

## 🧭 Documentação Técnica

Ver pasta `docs/` para detalhes.

## 🧑‍💻 Contribuindo

Mais detalhes em `docs/contributing.md`.

## 📜 Licença

MIT © [Seu Nome ou Empresa]
