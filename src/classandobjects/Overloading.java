package classandobjects;

public class Overloading {
	
	static String name = "Tony";
	int age = 25;
	
	public static void main(String[] args) {
		System.out.println("This is the original main method");
		main(100);
		main(args = new String[3], args = new String[4]);
		
		Overloading overloading = new Overloading();
		overloading.test();
		overloading.test(100);
		overloading.test(10,20);
		
		System.out.println(overloading.name+" "+overloading.age);
		
	}
	
	public static void main(int i) {
		System.out.println("This is the overloaded main method");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is the overloaded main method in different way");
		//main(args1 = new String[7]);
		//main(args2 = new String[8]);
	}
	
	public void test () {
		System.out.println("This is a non-static non-overloaded method");
	}
	
	public void test (int i) {
		System.out.println("This is a non-static overloaded method with single parameter");
	}
	
	public void test (int j, int k) {
		System.out.println("This is a non-statuc method with two parameters");
	}
}
