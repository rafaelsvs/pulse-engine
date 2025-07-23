package com.pulse.dto;

public record IncentiveOfferRequest(
        String agentId,
        String geohash,
        String timestamp,
        double trustScore,
        double urgencyFactor
) {}
