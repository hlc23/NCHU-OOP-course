abstract class Animal{
	protected String name;
	
	abstract public String getSound();
	abstract public String getFood();
	
	protected Animal(String name){
		this.name = name;
	}

	public void describe(){
		System.out.println("I am "+this.name+", I say "+this.getSound()+", and I like to eat "+this.getFood()+".");
	}
}

class Lion extends Animal{
	
	Lion(String name){
		super(name);
	}
	
	@Override
	public String getSound() {
		return "Roar";
	}
	
	@Override
	public String getFood() {
		return "Meat";
	}
}

class Elephant extends Animal {
	
	Elephant(String name){
		super(name);
	}
	
	@Override
	public String getSound() {
		return "Pawoo";
	}
	
	@Override
	public String getFood() {
		return "Grass";
	}
}

class Monkey extends Animal{

	Monkey(String name){
		super(name);
	}
	
	@Override
	public String getSound() {
		return "Ooh ooh aah aah";
	}
	
	@Override
	public String getFood() {
		return "Banana";
	}
}