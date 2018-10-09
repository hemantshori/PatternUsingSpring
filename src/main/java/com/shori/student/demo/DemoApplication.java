package com.shori.student.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//LetsDoGrocery buy = new LetsDoGrocery(new Coles());
		//buy.buySomething("milk");
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(DemoApplication.class, args);
		 applicationContext.getBean(LetsDoGrocery.class).buySomething("milk");
		 
		 applicationContext.getBean(CashOut.class).cashOut(200);
	
	}
}
