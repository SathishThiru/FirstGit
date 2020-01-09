package org.hierarchical.inheritance;
//it is a sub class and rbi is it parent class
public class Idbi extends Rbi {
	public void accNo() {
		System.out.println("Idbi Account number is : IDBI8907");
	}
	
	public void atmPin() {
		System.out.println("Idbi atmpin is : 6754");
	}

	public static void main ( String [] args) {
		Idbi id = new Idbi();
		id.aadharDetails();
		id.panDetails();
		id.accNo();
		id.atmPin();
		
	}
}
