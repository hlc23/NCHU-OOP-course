import java.util.Scanner;

class Person {
	protected String name;
	protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.print(this.name + " is " + this.age + " years old and ");
    }
}

class Athlete extends Person {
    private String sport;

    Athlete(String name, int age, String sport) {
        super(name, age);
        this.sport = sport;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("plays " + this.sport + ".");
    }
}
class Coach extends Person {
    private int experience;
    
    Coach(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    void introduce() {
        super.introduce();
        System.out.println("has "+experience+" years of coaching experience.");
    }
}



//public class Main{
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int c = s.nextInt();
//		for (int i=0; i<c; i++) {
//			String role = s.next();
//			if (role.equals("Athlete")) {
//				String name = s.next();
//				int age = s.nextInt();
//				String play = s.next();
//				new Athlete(name, age, play).introduce();
//			}
//			else {
//				String name = s.next();
//				int age = s.nextInt();
//				int year = s.nextInt();
//				new Coach(name, age, year).introduce();
//			}
//		}
//		s.close();
//	}
//}