package com.aits.Springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BookingService {
	 public BookingService() {
	 }
	private  TransportService t;
	
	@Autowired
	public BookingService(@Qualifier("busservice")TransportService t) {
		this.t=t;
	}
	public void setTransportService(TransportService t) {
		this.t=t;
	}
	public void BookTicket(String source, String destination) {
		t.BookTicket(source,destination);
	}

}
