package com.amdocs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.training.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{

}
