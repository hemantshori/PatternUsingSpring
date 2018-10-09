package com.shori.student.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Coles implements Grocery{
	
	public void buyGrocery(String what)
	{
		System.out.println("I buy grocery at coles and i buy " +what);
	}

	@Override
	public void cashOut(int howMuch) 
	{
		
		System.out.println("@Coles  getting gashout of " +howMuch);
	}

	
	
}
