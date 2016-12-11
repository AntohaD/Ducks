package com.dzherdzh.anton.Ducks;

import com.dzherdzh.anton.Actions.NaturalMovement;

public class RedHeadDuck extends ADuck
{
	
	@Override
	public void display()
	{
		System.out.println("Redhead duck");		
	}
	
	public RedHeadDuck()
	{
		setIFly(new NaturalMovement());
	}

}
