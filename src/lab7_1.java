// Mission 1：Change the parent class Shape to an "abstract class" and change Area and Perimeter to "abstract methods"
abstract class Shape {
    protected abstract double Area(); //output area
    protected abstract double Perimeter(); //output perimeter
}

//Mission 2：Rewrite the Area and Perimeter methods in the Triangle class, filling in the omitted parts to return the corresponding values
class Triangle extends Shape{
    private double length; //side length of equilateral triangle
	
    public Triangle(double length) {this.length = length;} //constructor
	
    @Override
    public double Area() {
    	return 0.25*this.length*this.length*Math.pow(3, 0.5);
    }

    @Override
    public double Perimeter() {
    	return 3*this.length;
    }
}

//Mission 3：Rewrite the Area and Perimeter methods in the Square class, filling in the omitted parts to return the corresponding values
class Square extends Shape{
    private double length; //side length of square
	
    public Square(double length) {this.length = length;} //constructor
	
    @Override
    public double Area() {
    	return this.length*this.length;
    }

    @Override
    public double Perimeter() {
    	return this.length*4;
    }
}

public class Main {
    public static void main(String[] args) {
    // Mission 5：In the Main class, use "polymorphism" to create Triangle(5) and Square(4) objects, and have both call the showInfo method
    	Square s = new Square(4);
    	Triangle t = new Triangle(5);		

    	showInfo(s);
        showInfo(t);
    }

  	//Mission 4：Rewrite showInfo using "polymorphism" instead of "overloading", meaning there will be only one showInfo function in the Main class
    public static void showInfo(Shape s) {
		System.out.printf("%.2f\n",s.Area());
		System.out.printf("%.2f\n",s.Perimeter());
    } 
}