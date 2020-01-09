package first.project;

public class Test extends Test1
{
	
Test()
{
	super();
	System.out.println("sub const");
}

public static void main(String[] args) {
	Test t = new Test();
}


}

class Test1
{
	public void method()
	{
		System.out.println("method");
	}

}