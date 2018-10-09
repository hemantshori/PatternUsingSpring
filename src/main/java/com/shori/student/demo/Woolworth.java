package com.shori.student.demo;

import org.springframework.stereotype.Component;

@Component
public class Woolworth implements Grocery{

	public void buyGrocery(String what)
	{
		System.out.println("I buy grocery at wooly and i buy " +what);
	}
	
	@Override
	public void cashOut(int howMuch) 
	{
		
		System.out.println("@Wooly  getting gashout of " +howMuch);
	}
}
