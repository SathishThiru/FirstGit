package org.dereferencing;



public class Dereferencing{
	
	
	public void chuma()
	{
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		
		//object w is created. and a reference is created.
		//adhavadhu obj direct ah create aagidadhau
		// reference create aggum.
		//adhavadhu oru memory adress irukum
		//andha memory adress dhan reference la irukum
		//andha reference la iruka memory address poi paatha
		//adhukulla object create aagi ukkandhurukkum
		Dereferencing w = new Dereferencing();
		
		// w.chuma(); ipa first dereference nadakum
		/// adhavadhu already create aana reference ku poi
		//adhu ulla iruka adress value ah paathu
		//andha adress location kulla poi
		// w nra object ah eduthu method call nadakkum
		w.chuma();
		
		// keezha iruka statement la w nra object = null nu kuduthutta
		// apram reference adress null nu aagidum
		// apdina nama adress locaction eh kudukala
		// ;location illama enga poi object ah compiler theda mudiyum?
		//apa error throw pannum.
	//	w = null;
	//	w.chuma();
	}
 
}
