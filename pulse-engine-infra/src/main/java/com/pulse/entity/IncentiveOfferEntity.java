package com.pulse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "incentive_offers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IncentiveOfferEntity {

    @Id
    private String offerId;

    private String agentId;
    private String region;
    private double amount;
    private Instant timestamp;
}
