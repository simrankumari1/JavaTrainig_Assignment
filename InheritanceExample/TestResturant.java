package com.InheritanceExample;
import java.util.*;
public class TestResturant 
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	Chinesse c1=new Chinesse();
	Mexican m1=new Mexican();
	Italian i1=new Italian();
	System.out.println("eneter the Ingredients and vegetable");
	c1.setIngredients(sc.nextLine());
	c1.setVegetables(sc.nextLine());
	
	
   }
}
