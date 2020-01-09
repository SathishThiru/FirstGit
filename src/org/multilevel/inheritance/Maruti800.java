package org.multilevel.inheritance;


//step 5 - checking for constructor.
class Car{
	// step 6 - constructor is there   
	public Car()
	   {
		System.out.println("Class Car"); // step 7 - executing constructor code
		// print first line of op as class car. then return to class marutis constructor
	   }
	   public void vehicleType()
	   {
		System.out.println("Vehicle Type: Car");
	   }
	}

//step 4 - constructor iruka nu check panna varum
	// but extends keyword is there. so it will goto check if there is
	// any constructor in class 'car'
	class Maruti extends Car{
	   public Maruti()
	  // step 8 - executing constructor - print class maruti. then return to class maruti800 constructor.
	   {
		System.out.println("Class Maruti");
	   }
	   
	   public void brand()
	   {
		System.out.println("Brand: Maruti");
	   }
	   public void speed()
	   {
		System.out.println("Max: 90Kmph");
	   }
	}
	// step 3 - constructor called
	// but extends keyword is there. so it will goto check if there is
	// any constructor in class 'Maruti'
	public class Maruti800 extends Maruti{

	   //step 9- executing constructor. printing Maruti Model: 800. go to main
		
		public Maruti800()
	   {
		System.out.println("Maruti Model: 800");
	   }
		
	   public void speed()
	   {
		System.out.println("Max: 80Kmph");
	   }
		   
	   public static void main(String args[])// step 1 - main
	   {
		 Maruti800 obj=new Maruti800(); // step 2 - calling constructor
		 obj.vehicleType(); // step 10. 
		 obj.brand(); // step 11
		 obj.speed(); // step 12
		 
	
	   }
	}