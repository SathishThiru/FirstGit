package org.scanners;
import java.util.*;

//important program
// next() nu paatha input kekkum
// kudukara input la the token before first space ll be printed
//adhavadhu first soace varadhuku munnadi neenga  enna input ah kudukaringalo adha dhan adhu eduthukum
// input1 la next() ku kudutha input ah store pannittom. say hi hello mam. it ll print only hi
// next input 2 ah input panna solli namma kita kekkum nu nenaipom
// aana ekkadhu. automatic ah input1 la hi ah thavira meedhi iruka hello mam ah input2 la store panni
// andha reult ah print pannidum



public class NextAndNextLine {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter input");
		String input1= s.next();
		System.out.println("entered input shows only the data till the first space");
		System.out.println(input1);
		
		System.out.println("enter 2nd input" );
		String input2 = s.nextLine();
		System.out.println("Entered input shows fully in the output" +input2);
	}
}

