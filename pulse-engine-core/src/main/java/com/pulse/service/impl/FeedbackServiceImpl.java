package com.pulse.service.impl;

import com.pulse.dto.IncentiveFeedbackRequest;
import com.pulse.entity.FeedbackEventEntity;
import com.pulse.model.Feedback;
import com.pulse.repository.FeedbackEventRepository;
import com.pulse.service.FeedbackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private static final Logger log = LoggerFactory.getLogger(FeedbackServiceImpl.class);
    private final FeedbackEventRepository repository;

    public FeedbackServiceImpl(FeedbackEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerFeedback(IncentiveFeedbackRequest feedback) {
        log.info("Feedback recebido - offerId: {}, agentId: {}, accepted: {}, completed: {}",
                feedback.offerId(), feedback.agentId(), feedback.accepted(), feedback.completed());

        // Traduz flags em status
        String status = feedback.accepted()
                ? (feedback.completed() ? "COMPLETED" : "ACCEPTED")
                : "REJECTED";

        Feedback model = new Feedback(
                feedback.offerId(),
                feedback.agentId(),
                status,
                Instant.now()
        );

        FeedbackEventEntity entity = new FeedbackEventEntity(
                model.offerId(),
                model.agentId(),
                model.status(),
                model.timestamp()
        );

        repository.save(entity);

        log.debug("Evento persistido com sucesso: {}", entity);
    }
}