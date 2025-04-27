import java.util.*;

class Animal{
	protected String name;
	protected int age;
	protected double weight;
	
	Animal(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void makeSound() {
		System.out.println(this.name + " makes a sound.");
	}

	public void displayInfo() {
		System.out.println("Name: "+this.name+", Age: "+this.age+", Weight: "+this.weight);
	}
}

class Mammal extends Animal{
	Mammal(String name, int age, double weight){
		super(name, age, weight);
	}
	public void grow() {
		this.age += 1;
		this.weight += 5;
		System.out.println(this.name + " grows: Age is now "+this.age+", Weight is now "+this.weight);
	}
}

class Bird extends Animal {
	private String migrationLocation;
	
	Bird(String name, int age, double weight, String location){
		super(name, age, weight);
		this.migrationLocation = location;
	}
	
	public void migrate() {
		System.out.println(this.name + " migrates to "+this.migrationLocation);
	}
}

class Zoo {
	Animal[] animals;
	
	Zoo(Animal[] animals){
		this.animals = animals;
	}
	
	public void showAnimalsInfo() {
		for (Animal a: this.animals) {
			a.displayInfo();
			a.makeSound();
		}
	}
}


public class Main {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String mammalName = scanner.nextLine();

int mammalAge = scanner.nextInt();

double mammalWeight = scanner.nextDouble();

scanner.nextLine();

String birdName = scanner.nextLine();

int birdAge = scanner.nextInt();

double birdWeight = scanner.nextDouble();

scanner.nextLine();

String migrationLocation = scanner.nextLine();

Mammal lion = new Mammal(mammalName, mammalAge, mammalWeight);

Bird eagle = new Bird(birdName, birdAge, birdWeight, migrationLocation);

Zoo zoo = new Zoo(new Animal[]{lion, eagle});

zoo.showAnimalsInfo();

System.out.println("\nAfter one year:");

lion.grow();

eagle.migrate();

zoo.showAnimalsInfo();

scanner.close();

}

}