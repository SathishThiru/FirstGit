package thread;
// indha pgm la nama steps mark panni irukom.
//aana adhu endha alavukku correct nu therila.
// also note that this prog gives diff op every time

// note that class Thread is inbuilt
public class DaemonThread extends Thread 
{ 
	//step 3 - constructor called
	// idhula constructor call aana apa parent class la consructor irundha adhu implicit ah call agum
	// call aagi adhu first execute agum
	//
	
    public DaemonThread(String name){ 
        super(name); // step 4 - super ah higlight panni paru. super keyword super class 
        // Thread ku poi adhoda constructor ah call pannum
        // name la t1 nu store pannum
    } 
  
    // step 8 - came to run method and execute if else
    public void run() 
    {  
        // Checking whether the thread is Daemon or not 
        if(Thread.currentThread().isDaemon()) 
        {  
            System.out.println(getName() + " is Daemon thread");  
        }  
          
        else
        {  
            System.out.println(getName() + " is User thread");  
        }  
        
     
     
    } 
    
  //step 1 - main
      
    public static void main(String[] args) 
    {  
      
        DaemonThread t1 = new DaemonThread("t1"); // step 2 - constructor calling.
        DaemonThread t2 = new DaemonThread("t2"); // repeat above steps from step 2 to 4
        DaemonThread t3 = new DaemonThread("t3"); // repeat above steps from step 2 to 4
      
        // Setting user thread t1 to Daemon 
        t1.setDaemon(true); // hover over setDaemon to know more.
        // step 5 t1 ah daemon thread ah set panrom
             
        // starting first 2 threads  
        t1.start();  // step 6 - hover over start
        //start nradhu Thread class oda method.
        //adhukulla run method irukum
        // aana nama Thread kulla iruka run method ah override panni DaemonThread class kulla 
        // oru busines code ezhudhi irukom.
        // step 7 - goto run method
        
      
        t2.start(); 
  
        // Setting user thread t3 to Daemon 
        t3.setDaemon(true);  
        t3.start();         
    }  
} 