package org.ifelse;


/*
 * 3 classes: Sample is driver class or class with main method
 * class A is super
 * class B is sub class
 * main method la irundhu B oda constructor cal panrom with arguments
 * apa B constructor call aagum.
 * also andha constructor oda first line la super() implicit ah call agum
 * super method ll call constructor of base class.
 * base classs la nama constructor eh define panlanalum implicit ah onnu irukum 
 * which is hidden to us
 * ipa super method kulla nama arguments kudutha
 * apa super la iruka constructor ah poi paakum
 * aana super class la iruka constructor oru no arg constructor. 
 * so error thro pannum.
 * apa nama super class la no arg constructor ku badhila argument constructor ready pannanum.
 * 
 * 
 * 
 * 
 */
public class Sample {
	
	public static void main(String[] args) {
		 new B(10);
		 
		
	}

}

class A{
	
	A()
	{}
	
	A(int a)
	{
		System.out.println("constructor A");
	}
	
	
}

class B extends A{
	
	B(int a)
	{
		super(20);
		System.out.println(" constructor B with arguments");
	}
	
}