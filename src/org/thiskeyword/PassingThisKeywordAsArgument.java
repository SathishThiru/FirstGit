package org.thiskeyword;

class PassingThisKeywordAsArgument
{  
	  void m(PassingThisKeywordAsArgument obj){  
	  System.out.println("method is invoked");  
	 
	  }  
	  void p(){  
	   
	  System.out.println(this); // this keyword when used as a parameter it will give the current class's instance
	  // ipa s1.p nu indha method call aagi iruku. apa this will print s1 address
	  // then s2.p vachu call panra apa s2 oda address ah it ll print
	  m(this);
	  }  
	  
	  //step 1: entering main
	  public static void main(String args[])
	  {  
		  PassingThisKeywordAsArgument s1 = new PassingThisKeywordAsArgument(); // step 2 creating object reference
		  System.out.println(s1);// step 3: adrress of s1 instance will be printed.
	  s1.p();  // step 4: method p is callled
	  
	  PassingThisKeywordAsArgument s2 = new PassingThisKeywordAsArgument();
	  System.out.println(s2);
	  s2.p();
	  }  
	}  
