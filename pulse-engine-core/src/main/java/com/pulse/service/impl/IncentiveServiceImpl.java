package com.pulse.service.impl;

import com.pulse.dto.IncentiveOfferRequest;
import com.pulse.dto.IncentiveOfferResponse;
import com.pulse.entity.IncentiveOfferEntity;
import com.pulse.service.IncentiveOfferRepository;
import com.pulse.service.IncentiveService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.UUID;
import java.util.List;

@Service
public class IncentiveServiceImpl implements IncentiveService {

    private static final Random RANDOM = new Random();
    private final IncentiveOfferRepository offerRepository;

    public IncentiveServiceImpl(IncentiveOfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public IncentiveOfferResponse calculateOffer(IncentiveOfferRequest request) {
        String agentId = request.agentId();
        String region = request.region();
        Instant timestamp = Instant.now();

        double demandScore = RANDOM.nextDouble();
        double supplyScore = RANDOM.nextDouble();
        double acceptanceRate = RANDOM.nextDouble();
        double weatherPenalty = RANDOM.nextBoolean() ? 0.0 : 1.0;
        boolean isPeakHour = isPeak(timestamp);

        double baseValue = 5.0;
        double demandWeight = 10.0;
        double supplyWeight = -6.0;
        double acceptanceWeight = 4.0;
        double weatherBonus = 3.0;
        double peakHourBonus = 2.5;

        double incentive = baseValue
                + (demandScore * demandWeight)
                + (supplyScore * supplyWeight)
                + (acceptanceRate * acceptanceWeight)
                + (weatherPenalty * weatherBonus)
                + (isPeakHour ? peakHourBonus : 0.0);

        double finalAmount = Math.max(1.0, Math.round(incentive * 100.0) / 100.0);

        IncentiveOfferResponse response = new IncentiveOfferResponse(
                UUID.randomUUID().toString(),
                agentId,
                region,
                finalAmount,
                timestamp
        );

        IncentiveOfferEntity entity = new IncentiveOfferEntity(
                response.offerId(),
                response.agentId(),
                response.region(),
                response.amount(),
                response.timestamp()
        );

        offerRepository.save(entity);

        return response;
    }

    private boolean isPeak(Instant timestamp) {
        int hour = LocalDateTime.ofInstant(timestamp, ZoneOffset.UTC).getHour();
        return (hour >= 7 && hour <= 9) || (hour >= 17 && hour <= 19);
    }

    @Override
    public List<IncentiveOfferResponse> listAll() {
        return offerRepository.findAll().stream()
                .map(entity -> new IncentiveOfferResponse(
                        entity.getOfferId(),
                        entity.getAgentId(),
                        entity.getRegion(),
                        entity.getAmount(),
                        entity.getTimestamp()
                ))
                .toList();
    }
}