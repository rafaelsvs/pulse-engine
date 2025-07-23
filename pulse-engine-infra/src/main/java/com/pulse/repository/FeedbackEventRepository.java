package com.pulse.repository;

import com.pulse.entity.FeedbackEventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackEventRepository extends JpaRepository<FeedbackEventEntity, Long> {
}
