package com.shori.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CashOut {
	
	@Autowired
	private Grocery grocery;

	public CashOut(Grocery grocery) {
		super();
		this.grocery = grocery;
	}
	
	
	
   public void cashOut(int howMuch)
   {
	   grocery.cashOut(howMuch);
   }
}
