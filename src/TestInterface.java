
public interface TestInterface {
	
	final void method()
	{
		System.out.println("Hello from static method inside interface");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		method();
	}

}
