package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	 
		System.out.println("in constructor: " + getClass().getSimpleName());
		
	}

	@Override
	public String getDailyWorkout() {
		return "Practice batting for 30 minutes";
	}
	
}
