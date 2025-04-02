package com.aits.Springdemo;

import org.springframework.stereotype.Component;

@Component("busservice")
public class BusService implements TransportService {

	@Override
	public void BookTicket(String source,String destination) {
		System.out.println("Bus ticket booked from " + source + " to " + destination);
		

	}

}
