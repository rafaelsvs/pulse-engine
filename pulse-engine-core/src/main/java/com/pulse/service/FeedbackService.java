package com.pulse.service;

import com.pulse.dto.IncentiveFeedbackRequest;
import java.util.List;
import com.pulse.entity.FeedbackEventEntity;

public interface FeedbackService {
    void registerFeedback(IncentiveFeedbackRequest request);
    List<FeedbackEventEntity> listAll();
}
