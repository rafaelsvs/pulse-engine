CREATE TABLE IF NOT EXISTS feedback_events (
    id SERIAL PRIMARY KEY,
    offer_id VARCHAR(255) NOT NULL,
    agent_id VARCHAR(255) NOT NULL,
    status VARCHAR(50) NOT NULL,
    timestamp TIMESTAMP NOT NULL
);
