package com.pulse.service;

import com.pulse.dto.IncentiveFeedbackRequest;
import java.util.List;
import com.pulse.model.Feedback;

public interface FeedbackService {
    void registerFeedback(IncentiveFeedbackRequest request);
    List<Feedback> listAll();
}
