package org.inheritance;

class Teacher {
	   private String designation = "Teacher";
	   private String collegeName = "Beginnersbook";
	   
	   
	   //step 6 - go into below method
	   public String getDesignation() 
	   // in this method the private member designation is converted into public
	   {
            return designation; // step 7 - show output and go to step 8 in main method.
	   }
	  
	   
	   //step 3 - contd. entering the below method
	   // the private member collegeName is converted to protected to be accessed by child class
	   protected String getCollegeName() {
		return collegeName; // step 4 here the private member collegeName is returned as output. 
		// then it ll go to step 5 which is in sub class below.
	   }
	   
	   //please note that the below method was never used. even if v remove the method the op ll be same
	  
	   protected void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		   }
		   
	   
	   // step 10 - calling does() and printing output
	   void does(){
		System.out.println("Teaching");
	   }
	}

	public class JavaExample extends Teacher{
	   String mainSubject = "Physics";
	   
	   // step 1: main as entry point
	   public static void main(String args[])
	   {
		JavaExample obj = new JavaExample(); // step 2 - obj creation
		/* Note: we are not accessing the data members directly.
		 *  we are using public getter method 
		 * to access the private members of parent class
		 */
		System.out.println(obj.getCollegeName()); // step 3  - it ll call parent class method. go above 
		// if we give obj.collegeName - it will not fetch detail from parent class 
		// coz collegeName is a private member.
		// so we are using getCollegeName() method.
		System.out.println(obj.getDesignation()); // step 5 contd. this ll call getDesignation method 
		// goto step 6. above class
		System.out.println(obj.mainSubject);
		// step 8 - getting the value of mainSubject from this class itself
		
		obj.does(); // step 9 goto parent class above and call does()
	   }
	}
