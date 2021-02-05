package com.cognizant.quiz.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.quiz.Repository.AttemptRepository;
import com.cognizant.quiz.model.Attempt;

@Service
public class AttemptService {
	@Autowired
	AttemptRepository attemptRepository;

	@Transactional
	public Attempt getAttempt(int userId, int attemptId) {
		return attemptRepository.getAttempt(userId,attemptId);
	}

}
