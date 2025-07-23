package com.pulse.service;

import com.pulse.dto.IncentiveOfferRequest;
import com.pulse.dto.IncentiveOfferResponse;
import java.util.List;

public interface IncentiveService {
    IncentiveOfferResponse calculateOffer(IncentiveOfferRequest request);
    List<IncentiveOfferResponse> listAll();
}
