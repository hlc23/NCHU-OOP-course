class Dog extends Animal { 
	final private String breed;
    
	Dog(String name, String breed){
		super(name);
		this.breed = breed;
	}
	
	String getBreed() {
		return this.breed;
	}
	
	public void makeSound() {
		System.out.println("Woof");
	}
}

class Cat extends Animal {
	final private boolean isDomestic;
	
	Cat(String name, boolean isDomestic){
		super(name);
		this.isDomestic = isDomestic;
	}
	
	public boolean getIsDomestic(){
		return this.isDomestic;
	}
	
	public void makeSound() {
		System.out.println("Meow");
	}
}