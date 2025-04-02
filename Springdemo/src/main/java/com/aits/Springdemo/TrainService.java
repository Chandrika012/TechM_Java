package com.aits.Springdemo;

import org.springframework.stereotype.Component;

@Component("trainservice")
public class TrainService implements TransportService {

	@Override
	public void BookTicket(String source, String destination) {
		 System.out.println("Train ticket booked from " + source + " to " + destination);

	}

}
