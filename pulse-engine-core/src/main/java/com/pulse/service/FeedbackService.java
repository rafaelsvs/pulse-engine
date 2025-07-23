package com.pulse.service;

import com.pulse.dto.IncentiveFeedbackRequest;

public interface FeedbackService {
    void registerFeedback(IncentiveFeedbackRequest feedback);
}
