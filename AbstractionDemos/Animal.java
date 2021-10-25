package com.AbstractionDemos;

public abstract class Animal
{
   abstract public void animalColor();
   abstract public void animalSound();
   abstract public void animalEating();
   public void animalSleep()
   {
	   System.out.println("This animal sleeps at morning");
   }
}
