import java.util.Scanner;

class Shape {
	private String name;
	private double area;
	private double perimeter;

	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected double getArea() {
		return area;
	}
	protected void setArea(double area) {
		this.area = area;
	}
	protected double getPerimeter() {
		return perimeter;
	}
	protected void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
}



class Oval extends Shape { 
    private int major, minor;
    private final double PI = 3.14;
    
    Oval(int major, int minor){
    	super();
    	this.major = major;
    	this.minor = minor;
    	
    	if (this.major == this.minor) {
    		this.setName("圓形");
    	}
    	else {
    		this.setName("橢圓形");
    	}
    	
    	this.setArea(this.PI*this.major*this.minor);
    	this.setPerimeter(2*this.PI*this.minor+4*(this.major-this.minor));
    }
    
    public void showInfo() {
    	System.out.printf("形狀:%s\n面積:%.2f\n周長:%.2f\n", this.getName(), this.getArea(), this.getPerimeter());
    }
}

class Rectangle extends Shape {
	private int width, height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		
		if (this.width == this.height) {
			this.setName("正方形");
		}
		else {
			this.setName("長方形");
		}
		this.setArea(this.width*this.height);
		this.setPerimeter(2*(this.height+this.width));
	}
	
	 public void showInfo() {
	    	System.out.printf("形狀:%s\n面積:%.2f\n周長:%.2f\n", this.getName(), this.getArea(), this.getPerimeter());
	 }
}


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Oval oval = new Oval(sc.nextInt(),sc.nextInt());
    oval.showInfo();
		
    Rectangle rec = new Rectangle(sc.nextInt(),sc.nextInt());
    rec.showInfo();

    sc.close();
  }
}

