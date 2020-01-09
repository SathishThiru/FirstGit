package method.overloading;

public class Abc {
	private int methodOne(int a, String b) {
		System.out.println("method from Abc:" + a +"\t" + b);
		return a;
	}
	

	
	public static void main(String[] args) {
		Abc a = new Abc();
		a.methodOne(5, "aaa");
	
			}
}


