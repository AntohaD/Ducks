package com.dzherdzh.anton.Ducks;

import com.dzherdzh.anton.Actions.CantFly;

public class WoodDuck extends ADuck {
	
	@Override
	public void display()
	{
		System.out.println("Wood Duck");
	}
	
	public WoodDuck()
	{
		setIFly(new CantFly());
	}

	

}
