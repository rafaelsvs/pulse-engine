package com.pulse.service;

import com.pulse.dto.IncentiveOfferRequest;
import com.pulse.dto.IncentiveOfferResponse;

public interface IncentiveService {
    IncentiveOfferResponse calculateOffer(IncentiveOfferRequest request);
}
