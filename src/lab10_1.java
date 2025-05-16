interface Flyable {
  void fly();
  void land();
}
interface Swimmable {
  void swim();
  void stopSwimming();
}
class Bird implements Flyable {
	public void fly() {
		System.out.println(this.getClass().getSimpleName() + " is flying.");
	}

	public void land() {
		System.out.println(this.getClass().getSimpleName() + " is landing.");
	}
}
class Duck implements Flyable, Swimmable{
	private String status = "land";
	public void fly() {
		if (this.status.equals("swim")) {
			System.out.println("Error: " + this.getClass().getSimpleName() + " can't fly while swimming.");
			return;
		}
		this.status = "fly";
		System.out.println(this.getClass().getSimpleName() + " is flying.");
	}
	public void land() {
		if (this.status.equals("swim")) {
			System.out.println("Error: " + this.getClass().getSimpleName() + " can't land while swimming.");
			return;
		}
		this.status = "land";
		System.out.println(this.getClass().getSimpleName() + " is landing.");
	}
	public void swim() {
		if (this.status.equals("fly")) {
			System.out.println("Error: " + this.getClass().getSimpleName() + " can't swim while flying.");
			return;
		}
		this.status = "swim";
		System.out.println(this.getClass().getSimpleName() + " is swimming.");
	}
	public void stopSwimming() {
		if (this.status.equals("fly")) {
			System.out.println("Error: " + this.getClass().getSimpleName() + " can't stop swimming while flying.");
			return;
		}
		this.status = "land";
		System.out.println(this.getClass().getSimpleName() + " has stopped swimming.");
	}
}
class Human implements Swimmable{
	public void swim() {
		System.out.println(this.getClass().getSimpleName() + " is swimming.");
	}
	public void stopSwimming() {
		System.out.println(this.getClass().getSimpleName() + " has stopped swimming.");
	}
}

//public class Main {
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        Duck duck = new Duck();
//        Human human = new Human();
//        
//        bird.fly();
//        duck.swim();
//        duck.fly(); // This should print an error message
//        human.swim();
//
//        bird.land();
//        duck.stopSwimming();
//        duck.fly();
//        human.stopSwimming();
//    }
//}