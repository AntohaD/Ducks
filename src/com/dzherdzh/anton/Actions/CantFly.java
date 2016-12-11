package com.dzherdzh.anton.Actions;

public class CantFly implements IFlyBehavior {
	
	@Override
	public void fly()
	{
		System.out.println("I can't fly");
	}

}
