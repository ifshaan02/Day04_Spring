package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	 
		System.out.println("in constructor: " + getClass().getSimpleName());
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your back-hand volley";
	}

}
