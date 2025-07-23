package com.pulse.dto;
import java.time.Instant;

public record IncentiveOfferResponse(
        String offerId,
        String agentId,
        String region,
        double amount,
        Instant timestamp
) {}