package com.pulse.service.impl;

import com.pulse.dto.IncentiveFeedbackRequest;
import com.pulse.service.FeedbackService;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private static final Logger log = LoggerFactory.getLogger(FeedbackServiceImpl.class);

    @Override
    public void registerFeedback(IncentiveFeedbackRequest feedback) {
        log.info("Feedback recebido: {}", feedback);
        // Futuramente: salvar em DB ou publicar em Kafka
    }
}
