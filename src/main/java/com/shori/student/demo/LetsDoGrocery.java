package com.shori.student.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LetsDoGrocery {
	
	@Autowired
	private Grocery grocery;

	public LetsDoGrocery(Grocery grocery) {
		super();
		this.grocery = grocery;
	}
	
	
	public void buySomething(String what) {
		grocery.buyGrocery(what);
	}
	
}
