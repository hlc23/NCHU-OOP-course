package HW4;

public class Car extends Vehicle{
	private String model;
	
	public Car(){
		super(null, null, null);
		this.model = "N/A";
		this.setCylinderNumber(1);
	};
	public Car(String make, String color, int numCylinder, Person owner, String model){
		super(make, color, owner);
		this.model = model != null ? model : "N/A";
		this.setCylinderNumber(numCylinder);
	};
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public void gas() {
		System.out.println("A " + this.getColor() + " " + this.getManufacture() + " " + this.getModel() + " is accelerating ...");
	};

	public void brake() {
		System.out.println("A " + this.getColor() + " " + this.getManufacture() + " " + this.getModel() + " is slowing down ...");
	};

	public String toString() {
		return "Vehicle Type: Car\n" + 
				"Vehicle Manufacturer: " + this.getManufacture() + "\n" +
				"Vehicle Color: " + this.getColor() + "\n" +
				"Number of Cylinders: " + this.getCylinderNumber() + "\n" +
				"Owner: " + this.getOwner().toString() + "\n" +
				"Model: " + this.getModel() + "\n";
	};

	public boolean equals(Object object){
		if (object instanceof Car){
			Car otherCar = (Car)object;
			if (this.getColor() == otherCar.getColor() && 
				this.getManufacture() == otherCar.getManufacture() && 
				this.getModel() == otherCar.getModel() &&
				this.getCylinderNumber() == otherCar.getCylinderNumber() &&
				this.getOwner().equals(otherCar.getOwner())){
				return true;
			}
		}
		return false;
	}
	

}
