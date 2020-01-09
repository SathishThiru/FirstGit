package org.singleton.clas;


// read the comments inside class singleton and class Abc first. then go to steps
public class Singleton {
//step 1 - main
	public static void main(String[] srgs)
	{
		
		
		// read the comments fully till the end
		/// here in this method we can create any number of objects for Class Abc
		// eg Abc obj1 = new Abc();
		// or eg: Abc obj2 = new Abc();
		// lets say that i want to allow the user to create only one instance or only one object. 
		// how do we do that?
		// to know go to comments of classs Abc
	
		Abc.getInstance().method1(); // step 2. calling getInstancefirst // step 7 // object of class Abc is returned
		//and that obj is used to call method1.
		
		//ethana dhadava getinstance ah call pannalum same memory location dhan throw pannum
		Abc.getInstance();
		
		
		//ipa class Abc la incrementA nu oru method iruku.
		// int a = 10 nu class oda beginning layae nama initialize panni vachurukkom
		// Singleton nra class kulla Abc obj - new Abc();
		// Abc obj1 = new Abc();
		// apdinu ethana obect venumna create pana mudiyuma?
		
		// mudiyadhu. yen na object create panra apa constructor call agum
		// aana naama constructor ah private nu vachurukom
		// so 
		// Abc class ku nama object create panna mudiyadhu
		// but abc class oda object venumna adha already create panna reurn panradhuu getInstance method vachurukom
		// so abc class oda objject venumna
		// getInstance method ah call pannikalam
		
		
		// ok ipa constructor ah naama public nu vachurundha enna agum?
		// public nu vachutta Singleton nra class kulla Abc class ku ethana object venumba create panlam
		// ovvoru dhadava object create anra appavum int a = 10 nu initialize aagum
		// so ovvoru object vachu incrementA method ah call panra appavum 11 nu dhan op varum
		
		/*Abc obj = new Abc();
		obj.incrementA();  op will be 11
		Abc obj1 = new Abc();
		obj1.incrementA();*/ // again op ll be 11
		
		// idhuvae getnInstance method la irundhu kedaikara object vachu incrementA method ah call panna
		// ovooru dhadava call panra appavum
		// op ll be incremented like 11, 12, 13
		Abc.getInstance().incrementA();
		Abc.getInstance().incrementA();
		
		// so vishayam enna na ovvoru dhadavayum Abc class oda getInstance ah call panra appavum
		// same object dhan namaku return agudhu
		// so ovvoru dhadavayum a=10 nu initialize aagadhu
		// for eg getInstance.incrementA nu first call panra apa 11 nu varum
		// ipa class Abc la iruka a variable la value 11 nu irukum
		// again getInstance call pannara apa same object dhan return agum. so andha object lyum a oda value 11. so ipa incrementA
		// koopta 12 nu varum
	}
	
}


//step 3 - entering calss Abc
class Abc
{
	int a=10;
	// creating only one instance of Abc:
	// step 1 - create a instance of Abc and keep it as static
	// ie) static Abc obj  = new Abc();
	// main method la Abc obj1 = new Abc() nu kudutha enna agum? 1. object create agum.
	// 2. Abc() nra default constructor of class Abc will be called.
	// apa indha default consttructor ah main method iruka class la irundhu call panna
	// allow panna koodadhu na, nama default constructor ah private aaka porom
	// ie) private Abc(){}
	// now if you go to main method and try to create an object of Abc, it lll throw error
	/// coz we made the default constructor as private which cant be called in main method 
	// which is in another class
	// then create a method as follows
	// public static Abc getInstance()
	//{ return obj;}
	// public ah irundha dhan it can be accesse my main method which is in different class
	// Abc is the reurn datatype of the method.
	// ipa indha get instance method ah main la call pannalam
	// main la ethanda dhava getInstance ah call pannallum orae object dhan return agum
	
	static Abc obj = new Abc(); // step 4 - creating object
	
	private Abc() {};
	
	public static Abc getInstance() // Abc is return datatype // step 5 method called
	{
		System.out.println(obj);
		return obj; // tsep 6 - returning object of class Abc
	}
	
	//stwp 8 - calling method1
	public void method1() {
		
		//step 9 - print
		System.out.println("calling method1 from class Abc using obj of Abc returned by getInstance method within class Abc");
	}
	
	public void incrementA()
	{
		a++;
		System.out.println(a);
	}
	

}