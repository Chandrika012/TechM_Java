package com.aits.Springdemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemoApplication.class, args);
		
		//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringdemoApplication.class);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookingService bookingService = context.getBean("bookingService", BookingService.class);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Transport mode: ");
        String c=sc.nextLine();
        
        System.out.print("Enter source: ");
        String source = sc.nextLine();
        System.out.print("Enter destination: ");
        String destination = sc.nextLine();
        
        switch (c) {
        case "bus":
            bookingService.setTransportService(context.getBean("busService", BusService.class));
            break;
        case "train":
            bookingService.setTransportService(context.getBean("trainService", TrainService.class));
            break;
        case "flight":
            bookingService.setTransportService(context.getBean("flightService", FlightService.class));
            break;
        default:
            System.out.println("Invalid transport mode. Please enter Bus, Train, or Flight.");
            
    }

        //BookingService.BookTicket(source, destination);
        bookingService.BookTicket(source, destination);
        sc.close();
        context.close();
	}

	 
}
