package org.constructor.overloading;
// step 3 - entering class and creating instance.
public class OverloadingExample2
{
   private int rollNum; // step 4 - intialize variable
  OverloadingExample2()
   // step 7 default constructor called and value assigned
   {
	   System.out.println("hiiii");
      rollNum =100;
   }
   
   //s tep 5 - constructor called with passing argument.
   OverloadingExample2(int rnum)
   {
	   //step 6 // this calls the default constructor
      this();
      /*this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * inside constructor body.
       */
     rollNum = rollNum+ rnum;// step 8 value added to 112 // goto main
   }
   
   class B extends OverloadingExample2{
	  int check=2;
	  
   }
   public int getRollNum() {
	  return rollNum;
   }
   
  
   public void setRollNum(int rollNum) {
	  this.rollNum = rollNum;
   }
   
   // step 1 - main
   public static void main(String args[])
   {
	   OverloadingExample2 obj = new OverloadingExample2(12); // step 2 - create instance and
	   // call parameterized constructor
       System.out.println(obj.getRollNum());// step 9 - op 
       
      // this is possible OverloadingExample2 o = new B();
 
    // this is no possible. B b = new OverloadingExample2();
    }
}

class B extends OverloadingExample2{
	
}
