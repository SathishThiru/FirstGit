package org.working.of.supermethod;

class Sample 
{
 public Sample() // step 4 - Sample constructor called. and op is printed.
 {
	 System.out.println("hi from super class constructor");

}
}


class SuperMethodExample1 extends Sample
{
	// step 2 - constructor SuperMethodExample1 called
	// step 3 - super method in first line of SuperMethodExample1 constructor is called.
	// which will call Sample constructor
	
	
	
public static void main(String[] args) {
	SuperMethodExample1 s = new SuperMethodExample1(); // here we create object for SuperMethodExample1
	// so it will call constructor of SuperMethodExample1
	// but SuperMethodExample1 nra classs la nama endha oru constructor um define panla.
	// nama define panlanalum default ah implicit ah veh ella class kum andha class ku nu oru
	// constructor creat aagi irukum
	// so SuperMethodExample1 oda object create panra apa it will call that implicit constructor.
	// andha implicit constructor kulla oru super method irukum
	// andha super method will call super class constructor if any
	// so step 1 - calling constructor of SuperMethodExample1
	
}


}