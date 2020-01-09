package org.ifelse;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;
		
		if((a>b)&&(a>c))
		{
			System.out.println("A is greater");
		}
		
		
		else if ((b>c)&& (b>a))
		{
			System.out.println("B is greater");
		}
		else {System.out.println("C is greater");}
		
		do {System.out.println("hi");} while(a==10);
	}
	
	
}
