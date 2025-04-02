package com.aits.Springdemo;

import org.springframework.stereotype.Component;

@Component("flightservice")
public class FlightService implements TransportService {

	@Override
	public void BookTicket(String source, String destination) {
		System.out.println("Flight ticket booked from " + source + " to " + destination);

	}

}
