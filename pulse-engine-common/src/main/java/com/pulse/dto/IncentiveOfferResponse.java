package com.pulse.dto;

public record IncentiveOfferResponse(
        double basePrice,
        double incentive,
        String strategyUsed
) {}
