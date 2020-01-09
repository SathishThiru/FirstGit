package org.constructor.overloading;

//step 3 entering class
class StudentData
{
	// step 4 - initiating variables
   private int stuID;
   private String stuName;
   private int stuAge;
   
   //step 5 - no arg constructor called
   StudentData()
   {
       //Default constructor
	   //step 6 - assigning values and return to main
       stuID = 100;
       stuName = "New Student";
       stuAge = 18;
   }
   StudentData(int num1, String str, int num2)
   {
       //Parameterized constructor
       stuID = num1;
       stuName = str;
       stuAge = num2;
   }
   //Getter and setter methods
   public int getStuID() {
       return stuID;
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;
   }
   
   //step 8 - called method is below
   public String getStuName() {
       return stuName; // returns studentn name // and so con continues the program
   }
   public void setStuName(String stuName) {
       this.stuName = stuName;
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }

   //step 1 - main
   public static void main(String args[])
   {
       //This object creation would call the default constructor
       StudentData myobj = new StudentData(); // step 2 to creating instance and calling constructor.
       System.out.println("Student Name is: "+myobj.getStuName()); // step 7 - calling method
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       StudentData myobj2 = new StudentData(555, "Chaitanya", 25); // overloading constructor
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }
}