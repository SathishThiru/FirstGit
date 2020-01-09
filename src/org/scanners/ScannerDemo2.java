package org.scanners;

//Java program to read some values using Scanner 
//class and print their mean. 

// very important

//main method ulla pogum
// while loop la condition has hasNextInt() check pannum. 
//first hasNext() na enna nu papom
// sc.hasNext() ah call panna
// usser kita input vangum
// input vangumae thavira adha store panni vachukadhu.
//user input kudutha hasNext() ll return value as true.
// user input kuduthae aganum
//apa dhan adutha line ah execute pannum
//hasNextInt() enna pannum na user kita input kekkum
//kedaikara input integer ah irundha it ll throw the value as true
//adhuku apram while block execute agum
// so everytime user integer input kuduka kuduka
// while loop continue agitae irukum
// epa user integer illadha vera datatype kudukararo apa automatic ah loop break agum
//next line ku poi mean calculation nadakum
// see video to understand hasNext:  https://www.youtube.com/watch?v=WTOc8VKjBvQ

import java.util.Scanner; 

public class ScannerDemo2 
{ 
 public static void main(String[] args) 
 { 
     // Declare an object and initialize with 
     // predefined standard input object 
     Scanner sc = new Scanner(System.in); 
   
    
     // Initialize sum and count of input elements 
     int count = 0, sum = 0; 

     System.out.println("Please enter numbers to calculate mean");
     // Check if an int value is available 
     
     while (sc.hasNextInt()) 
     { 
         // Read an int value 
    	 
         int num = sc.nextInt(); 
         sum += num; 
         count++; 
     } 
     int mean = sum / count; 
     System.out.println("Mean: " + mean); 
 } 
} 
