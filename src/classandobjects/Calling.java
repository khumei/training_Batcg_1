package classandobjects;

public class Calling {

	static String Language = "Automation";
	int time = 2;
	String complexity = "Medium";
	int Salary = 100000;
	
	public static void main(String[] args) {
	
		Calling calling = new Calling();
		Calling.Language = "Python";
		hello();
		Calling.hello();
		
		System.out.println(calling.Language);
		calling.bye();
	}

	public static void hello() {
		int age = 20;
		String height = "Short";
		System.out.println(Calling.Language);
	}
	
	public void bye() {
		System.out.println("Adios");
	}
}
