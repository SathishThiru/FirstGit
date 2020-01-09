package org.multiple.inheritance.using.interfac;

interface X
{
	// below is a purely abstract method. idhula {} braces -- adhavadhu empty braces kuda use panna mudiyadhu.
   public void myMethod() ;
}
interface Y 
{
	//static or default nu vandha andha method abstract method ah iruka mudiyadhu.
	//Abstract methods cannot be static or default. An abstract method is defined only 
	// so that it can be overridden in a subclass. However, static methods cannot be overridden.
   // keezha iruka method oru dummy. idhula iruka lines execute agadhu.
	// keezha iruka method ah naama class JavaExample la endha route layum call panna mudiyadhu.
	// so interface la iruka classes ellame 100% abstract class. indha classes kulla enna code ezhudhunalum
	// adhu waste. adha engayum use or execute panna mudiyadhu.
	
	public static void myMethod1() {
	   System.out.println("hi");
   };
}
class JavaExample implements X, Y
{
   public void myMethod()
   {
       System.out.println("Implementing more than one interfaces");
   }
   public static void main(String args[]){
	   JavaExample obj = new JavaExample();
	   obj.myMethod();
	  
	  
	   
   }
}
