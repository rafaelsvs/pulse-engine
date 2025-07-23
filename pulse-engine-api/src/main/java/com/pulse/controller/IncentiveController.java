package com.pulse.controller;

import com.pulse.dto.IncentiveFeedbackRequest;
import com.pulse.dto.IncentiveOfferRequest;
import com.pulse.dto.IncentiveOfferResponse;
import com.pulse.service.IncentiveService;
import com.pulse.service.FeedbackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/incentives")
public class IncentiveController {

    private final IncentiveService incentiveService;
    private final FeedbackService feedbackService;

    public IncentiveController(IncentiveService incentiveService, FeedbackService feedbackService) {
        this.incentiveService = incentiveService;
        this.feedbackService = feedbackService;
    }

    @PostMapping("/offer")
    public ResponseEntity<IncentiveOfferResponse> generateOffer(@RequestBody IncentiveOfferRequest request) {
        return ResponseEntity.ok(incentiveService.calculateOffer(request));
    }

    @PostMapping("/feedback")
    public ResponseEntity<Void> registerFeedback(@RequestBody IncentiveFeedbackRequest request) {
        feedbackService.registerFeedback(request);
        return ResponseEntity.ok().build();
    }
}
