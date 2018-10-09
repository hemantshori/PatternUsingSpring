package com.shori.student.demo;

import org.springframework.stereotype.Component;


public interface Grocery {

	
	public void buyGrocery(String what);
	public void cashOut(int howMuch);
}
