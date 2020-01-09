package org.hierarchical.inheritance;
//it is a sub class and rbi is it parent class
public class Icici extends Rbi{

	public void accNo() {
	System.out.println("ICICI acc no is: ICICI456");
	}
	public void atmPin() {
		System.out.println("Icici Atm Pin is: 1256");
	}
	public static void main( String[] args) {
		Icici i = new Icici();
		
		i.aadharDetails();
		i.panDetails();
		i.accNo();
		i.atmPin();
	
	}
}