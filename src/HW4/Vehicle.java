package HW4;

abstract class Vehicle {
	private String make;
	private String color;
	private int numCylinder;
	private Person owner;
	
	
	public Vehicle() {
		this.make = "N/A";
		this.numCylinder = 0;
		this.owner = new Person();
	}
	
	public Vehicle(String make, String color, Person owner){
		this.make = make != null ? make : "N/A";
		this.color = color != null ? color : "N/A";
		this.owner = owner != null ? owner : new Person();
	}
	
	public String getManufacture() {
		return this.make;
	}
	
	public void setManufacture(String make) {
		this.make = make;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getCylinderNumber() {
		return this.numCylinder;
	}
	
	public void setCylinderNumber(int numCylinder) {
		this.numCylinder = numCylinder;
	}
	
	public Person getOwner() {
		return this.owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	abstract public void gas();
	abstract public void brake();
	abstract public String toString();
	abstract public boolean equals(Object object);
}
