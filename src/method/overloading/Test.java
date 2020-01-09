package method.overloading;

class Test 
{ 
    // static variable 
    static int a = m1(); // 1step – call method. this method will be callled 
    // coz that method is static. if that method is not static it will not be called
    // and it ll throw error
      
    // step 4 - static block 
    static { 
        System.out.println("Inside static block"); 
    } 
      
    // static method 
    static int m1() { 
        System.out.println("from m1"); // step 2 prints
        return 20; // step 3 assigns a = 20
    } 
      
    // step 5 - static method(main !!) 
    public static void main(String[] args) 
    { 
       System.out.println("Value of a : "+a); 
       System.out.println("from main"); 
    } 
  
  
} 

