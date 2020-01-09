package org.scanners;

import java.util.Scanner; 
public class ScannerDemo1 
{ 
    public static void main(String[] args) 
    { 
        // Declare the object and initialize with 
        // predefined standard input object 
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        System.out.println("Please enter a string");
        String name = sc.nextLine(); 
  
        // Character input 
        System.out.println("Please enter a character");
        char gender = sc.next().charAt(0); //char at ku index values is always 0. Vera 
        //edhavadhu index value kudutha it will throw StringIndexOutOfBoundsException
  
        // Numerical data input 
        // byte, short and float can be read 
        // using similar-named functions. 
        System.out.println("Please enter an integer");
        int age = sc.nextInt(); 
        System.out.println("Please enter a long");
        long mobileNo = sc.nextLong(); 
        System.out.println("Please enter a double");
        double cgpa = sc.nextDouble(); 
  
        // Print the values to check if the input was correctly obtained. 
        System.out.println("Name: "+name); 
        System.out.println("Gender: "+gender); 
        System.out.println("Age: "+age); 
        System.out.println("Mobile Number: "+mobileNo); 
        System.out.println("CGPA: "+cgpa); 
    } 
} 