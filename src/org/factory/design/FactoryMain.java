package org.factory.design;

//definig driver class with main method
public class FactoryMain {

	// step 1 entering main
	
	public static void main(String[] args)
	{
		// indha main method la nama
		// keezha iruka endha class ku venumnalum obj create panlam
		// eg Android A = new Android();
		// or Os o = new Android();
		
		// but above method la lam we are disclosing for which class we are creating objects nu
		// sometimes v may not want to disclose that information
		// so we ll create a class called OperatingSystemFactory
		// andha class kulla namma methods ezhudha porom
		// andha methods namaku object ah return pannum
		// andha method ah nama main method la call panna, apa namaku object um kedaikkum
		//adhae nerathula user kita nama OperatingSystemFactory nra class la irundhu 
		// dhan nama obj create pannom nu nenachupanga. so avangalukku OS, android, ios nu
		// classes irukaradhae theriyadhu
		
		OperatingSystemFactory of = new OperatingSystemFactory(); //step 2
		// creating new onbjcet of
		Os obj = of.getInstance("Close"); //step 3 here if we pass string as Open then op ll be different
		// of object vachu OperatingSystemFactory la iruka getInstance method ah call panrom
		// also andha method kulla close nu argument um pass panrom
		// call panni indha method la return agara value ah Os class oda obj la store panrom.
		// step 4 will go to getInstance method
	
		
		
		obj.spec(); // step 6 - getInstance method namaku Ios oda object ah return panni iruku.
		//andha object value stored in obj now
		// so obj.spec() nu call panna Ios la iruka spec method call aagum
		// and adhula iruka print statement execute agum.
	}
	
}


// defining class 1
abstract class Os {

	abstract void spec();// step 7 - abstract method
}


//defining class 2
 class Android extends Os{

	public void spec()
	{
		System.out.println("most powerful OS");
	}
}
 
 // defining class 3
 class Ios extends Os {

		public void spec()
		{
			System.out.println("Most secure OS");
		}
	}
 
 //defining class 4
 class Windows extends Os {

		public void spec()
		{
			System.out.println("Most used OS");
		}
		}

class OperatingSystemFactory
{
	//step 4 cont.
 public Os getInstance(String str)// passing argument Close // Os is the return datatype of this method
 {
	 if(str.equals("Open"))
		 return new Android();
	 else if (str.equals("Close")) //step 5 return a new object of class Ios and goto main method
		 return new Ios();
	 else
		 return new Windows();

	 
	 
 }

}
 
 
 

