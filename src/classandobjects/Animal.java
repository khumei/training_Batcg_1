package classandobjects;

public class Animal {

	String name = "Romeo";
	int age = 9;
	String color = "Fawn";
	String breed = "Labrador";
	
	public static void main(String[] args) {
	
		new Animal();
		Animal animal = new Animal();
		Animal animal1 = new Animal();
		
		System.out.println(animal.name);
		System.out.println(animal.age);
		System.out.println(animal.color);
		System.out.println(animal.breed);
		System.out.println("************************************");

		animal1.name = "Honey";
		animal1.age = 1;
		animal1.color = "Black";
		animal1.breed = "Spitz";
		
		animal = animal1;
		
		System.out.println(animal.name);
		System.out.println(animal.age);
		System.out.println(animal.color);
		System.out.println(animal.breed);
		
		System.out.println("************************************");
		
		System.out.println(animal1.name);
		System.out.println(animal1.age);
		System.out.println(animal1.color);
		System.out.println(animal1.breed);
		
	}
	
	public void eating () {
	System.out.println("Romeo loves to eat");
	}
	public void sleeping () {
	System.out.println("Romeo loves to sleep");
	}
	public void guarding () {
	System.out.println("Romeo hates to guard");
	}
}
