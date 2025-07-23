package com.pulse.dto;

public record IncentiveFeedbackRequest(
        String agentId,
        String offerId,     // ID da oferta original, pode ser mock por enquanto
        boolean accepted,
        boolean completed,
        double responseTimeSeconds
) {}
