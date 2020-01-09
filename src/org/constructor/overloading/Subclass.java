package org.constructor.overloading;

class Parentclass
{
   //no-arg constructor
   Parentclass(){
	System.out.println("no-arg constructor of parent class");
   }
   //arg or parameterized constructor
   Parentclass(String str){
	System.out.println("parameterized constructor of parent class");
   }
}

//step 3 - entering subclass
class Subclass extends Parentclass
{
	// step 4 - calling constr
   Subclass(){
       /* super() must be added to the first statement of constructor 
	* otherwise you will get a compilation error. Another important 
	* point to note is that when we explicitly use super in constructor
	* the compiler doesn't invoke the parent constructor automatically.
	*/
	super("Hahaha");
	System.out.println("Constructor of child class");

   }
   void display(){
	System.out.println("Hello");
   }
   
   //step 1 - main
   public static void main(String args[])
   {		
	Subclass obj= new Subclass(); // step 2 - creates instance and calls constructor
	obj.display();	 
   }
}
