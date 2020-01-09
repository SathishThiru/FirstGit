package org.working.of.supermethod;

public class SuperMethodExample2  extends Sample1
{
	// step 3- constructor called
	SuperMethodExample2()
	{
		super(9);
		// step 4 - calling super() implicitly // will throw error
		// coz super class Sample1 la we have defined an 1 argument constructor
		// one argument constructor define panlana problem eh illa. automatic ah default constructor create agidum
		// but nama one argument constructor create panna explicit ah default constructor ayum define panniyae aganum
		System.out.println("hi from sub class constructor");
		}
	
	public static void main(String[] args) 
	//step 1- main
	{

		SuperMethodExample2 s = new SuperMethodExample2();// step 2 create obj and call constructor
	}
	
}

class Sample1
{
	Sample1(int i)
	{
		System.out.println("super class constructor with one argument");
	}
}
