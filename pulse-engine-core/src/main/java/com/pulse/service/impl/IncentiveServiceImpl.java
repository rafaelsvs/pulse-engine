package com.pulse.service.impl;

import com.pulse.dto.IncentiveOfferRequest;
import com.pulse.dto.IncentiveOfferResponse;
import com.pulse.service.IncentiveService;
import org.springframework.stereotype.Service;

@Service
public class IncentiveServiceImpl implements IncentiveService {

    @Override
    public IncentiveOfferResponse calculateOffer(IncentiveOfferRequest request) {
        double basePrice = 10.0;
        double baseIncentive = 2.0;

        double trustMultiplier = 1.0 + (request.trustScore() - 0.5); // ex: 0.85 → +35%
        double urgencyMultiplier = 1.0 + (request.urgencyFactor() - 1.0); // ex: 1.3 → +30%

        double incentive = baseIncentive * trustMultiplier * urgencyMultiplier;

        String strategy = "dynamic-mvp-v1";

        return new IncentiveOfferResponse(basePrice, round(incentive), strategy);
    }

    private double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
