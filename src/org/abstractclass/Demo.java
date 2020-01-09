package org.abstractclass;

class Example1{
	   public void display1(){
	      System.out.println("display1 method");
	   }
	}
	abstract class Example2{
	   public void display2(){
	      System.out.println("display2 method");
	   }
	}
	abstract class Example3 extends Example1{
	   abstract void display3();
	   public void disCheck() {
		   System.out.println("check");
	   }
	}
	class Example4 extends Example3{
	   public void display3(){
	      System.out.println("display3 method");
	   }
	}
	class Demo{
	   public static void main(String args[]){
	       Example4 obj=new Example4(); // orae package kulla iruka classes ku main method la 
	       // direct ah main method la irundhae object create panlam.
	       obj.display3();
	       obj.disCheck();// this method available in abstract class Example 3.
	       // Example3 is an abstract class. but the method disCheck is not abstract.
	       // which means abstract class can have both abstract methods and 
	       // also non abstract methods.
	       // non abstract methods ah endha class access pannudho adhu kandipa implement pannanum nu 
	       // avasiya illa
	       // but abstract class ah kandipa imlement pannanum
	       
	   }
	}