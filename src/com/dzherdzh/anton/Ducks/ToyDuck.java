package com.dzherdzh.anton.Ducks;

import com.dzherdzh.anton.Actions.FlyWithEngine;

public class ToyDuck extends ADuck{

	@Override
	public  void display()
	{
		System.out.println("Toy duck");	
	}
	
	public ToyDuck()
	{
		setIFly(new FlyWithEngine());
	}

}
