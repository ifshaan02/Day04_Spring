package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class TrackCoach implements Coach
{
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	 
		System.out.println("in constructor: " + getClass().getSimpleName());
		
	}
	@Override
	public String getDailyWorkout() {
		return "run 3k";
	}

}
