package Generics;

import java.text.NumberFormat;

public class GenTest 
{
	
	public static void main(String args[])
	{
		
		Number n = new Integer(48);
		
		GenTest gt = new GenTest();
		//Creating Integer object
		gt.getInteger();
		//Creating String object
		gt.getString();
	}
	
	public void getInteger()
	{
		Gen<Integer> genInt = new Gen<Integer>(88);
		
		System.out.println(genInt.getValue());
	}
	
	public void getString()
	{
		Gen<String> genString = new Gen<String>("abcd");
		
		System.out.println(genString.getValue());
	}
}
