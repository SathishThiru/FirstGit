package org.hierarchical.inheritance;
//it is a sub class and rbi is it parent class
public class Sbi extends Rbi {
	public void accNo()
	{
		System.out.println("Account number is: SBIN2345");
	}
	
	public void atmPin() {
		System.out.println("Atm Pin is 3456");
	}
public static void main(String[] args) {
	Sbi s = new Sbi();
	s.aadharDetails();
	s.panDetails();
	s.accNo();
	s.atmPin();
}
}
