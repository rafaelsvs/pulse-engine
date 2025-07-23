# 🚀 Pulse Engine

Plataforma de simulação e registro de incentivos em tempo real — ideal para testar motores de precificação, mecanismos de feedback e decisões operacionais automatizadas.

---

## 🧠 Visão Geral

O Pulse Engine é um projeto modular com foco em:

- Geração de incentivos baseados em múltiplos sinais
- Registro de feedbacks de aceitação ou rejeição
- Persistência e visualização via API REST
- Extensibilidade para motores de decisão mais sofisticados (ex: A/B, ML)

---

## 📦 Módulos

| Módulo             | Descrição                                     |
|--------------------|-----------------------------------------------|
| `pulse-engine-api` | Exposição de endpoints REST                  |
| `pulse-engine-core`| Lógica de negócio (serviços, DTOs, regras)   |
| `pulse-engine-infra` | Persistência com JPA/Postgres              |
| `pulse-engine-common` | Entidades e objetos compartilhados        |
| `pulse-engine-test`| Scripts e simulações para testes locais      |

---

## ⚙️ Setup Local

```bash
git clone https://github.com/seu-usuario/pulse-engine.git
cd pulse-engine
docker-compose up --build

```

Após isso, acesse:
- Swagger UI: http://localhost:8080/swagger-ui
- API: http://localhost:8080/health, /offers, /feedbacks etc.

🗃️ Banco de Dados
O schema padrão está em docs/database-schema.sql.

Inclui:
- Tabela incentive_offers
- Tabela feedback_events

🧪 Testes
```bash
mvn clean test
``

## 🧭 Documentação Técnica

| Módulo             | Descrição                                     |
|---------------------|----------------------------------------------|
| `architecture.md`   | Visão de alto nível da arquitetura           |
| `decision-engine.md`| Como funciona o motor de decisões            |
| `endpoints.md`      | Lista de endpoints e payloads                |
| `observability.md`  | Logs, métricas e rastreamento                |
| `dev-setup.md`      | Guia rápido de setup local                   |
| `docker.md`         | Detalhes da infra com Docker                 |
| `faq.md`            | Perguntas frequentes                         |
| `roadmap.md`        | Próximos passos e melhorias planejadas       |

---