package com.pulse.model;

import java.time.Instant;

public record Feedback(String offerId, String agentId, String status, Instant timestamp) {}
