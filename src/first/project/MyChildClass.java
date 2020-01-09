package first.project;

// step 4 - checking whether constructor iis available.
class MyParentClass {
	// step 5 - constructor available. executing its code   
	MyParentClass(){
		System.out.println("MyParentClass Constructor"); //step 6 - printing op then go 
		// to sub class constructor
	   }
	}
//step 3 - extends keyword pathutu keezha iruka constructor ah poi paakama
// adhuku munnadi super cass la constructor iruka nu paakum

class MyChildClass extends MyParentClass{ 
	//step 7 - executing subclass constructor.  
	MyChildClass() {
		//step 8 - printing op
		System.out.println("MyChildClass Constructor");
		}
	
	//step - 1 main
	   public static void main(String args[]) {
		new MyChildClass(); // step 2 - calling constructor
	   }
	}
	
	/*
	The above one is very important program. Watch the steps and see the op properly.
Step 1 – main
Step 2 - new MyChildClass(); idhu constructor name. 
Apa indha constructor dhan execute aaganum. 
Apa op la first line MyChildClass Constructor nu varanum. 
But actual op la first line MyParentClass Constructor. 

Apdi na enna nadandhurukku? 
new MyChildClass(); constructor call panni irukom.
Apa andha class ku pogum. 
Andha class oda first line la extends keyword ah pattha udanae indha constructor ah
 execute panama parent class oda constructor ah execute pannum first.
Apa dhan first line la MyParentClass Constructor nu print agum. 
Apram dhan MyChildClass(); constructor kulla iruka line execute aagi MyChildClass nu 
op print agum.

So inga constructor call panna udanae extends keyword irukaradhala
 automatic ah super class oda constructor execute aagitu apram dhan 
 sub class constructor execute agum.

Idhuvae super class la constructor eh illana direct ah sub 
cass oda constructor code mattum execute agum.
 Adhavadhu MyParentClass() nra constructor illama adhukulla vera evlo methods
  irundhalum, adhellam execute agadhu. Direct ah sub class 
  ‘MyChildClass’ la iruka constructor mattum dhan execute agum.

	
	
	*/