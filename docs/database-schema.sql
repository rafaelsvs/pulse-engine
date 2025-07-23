-- Tabela de ofertas de incentivo
CREATE TABLE incentive_offers (
    offer_id VARCHAR PRIMARY KEY,
    agent_id VARCHAR NOT NULL,
    region VARCHAR NOT NULL,
    amount DOUBLE PRECISION NOT NULL,
    timestamp TIMESTAMP NOT NULL
);

-- Tabela de feedbacks
CREATE TABLE feedback_events (
    id SERIAL PRIMARY KEY,
    offer_id VARCHAR NOT NULL,
    agent_id VARCHAR NOT NULL,
    status VARCHAR NOT NULL,
    timestamp TIMESTAMP NOT NULL
);
