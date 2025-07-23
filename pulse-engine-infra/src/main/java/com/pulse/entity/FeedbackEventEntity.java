package com.pulse.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "feedback_events")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackEventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String offerId;
    private String agentId;
    private String status;
    private Instant timestamp;

    // Construtor manual adicional (sem id)
    public FeedbackEventEntity(String offerId, String agentId, String status, Instant timestamp) {
        this.offerId = offerId;
        this.agentId = agentId;
        this.status = status;
        this.timestamp = timestamp;
    }
}