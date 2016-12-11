package com.dzherdzh.anton.Ducks;

import com.dzherdzh.anton.Actions.IFlyBehavior;

public abstract class ADuck {
	IFlyBehavior behavior;
	
	ADuck() 
	{
		
	}
	
	public void usefly()
	{
		behavior.fly();
	}
	
	public void setIFly(IFlyBehavior behavior)
	{
		this.behavior = behavior;
	}
	
	public void move () 
	{
		System.out.println("I can move");
	}
	
	public void swim ()
	{
		System.out.println("I can swim");
	}
	
	public abstract void display();
	
	// move
	// swim
	// a display
	// fkyBehavior() - behavior.fly()

}
