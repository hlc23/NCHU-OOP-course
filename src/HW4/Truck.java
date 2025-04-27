package HW4;

public class Truck extends Vehicle{
	private double loadCapacity;
	private int towingCapacity;

	Truck(){
		super(null, null, null);
		this.loadCapacity = 0.0;
		this.towingCapacity = 0;
	}

	Truck(String make, String color, int numCylinder, Person owner, double ton, int pound){
		super(make, color, owner);
		this.loadCapacity = ton > 0 ? ton : 0.0;
		this.towingCapacity = pound > 0 ? pound : 0;
	}

	public double getLoadCapacity() {
		return this.loadCapacity;
	}
	public void setLoadCapacity(double ton) {
		this.loadCapacity = ton > 0 ? ton : 0.0;
	}
	public int getTowingCapacity() {
		return this.towingCapacity;
	}
	public void setTowingCapacity(int pound) {
		this.towingCapacity = pound > 0 ? pound : 0;
	}
	public void gas() {
		System.out.println("A " + this.getColor() + " " + this.getManufacture() + " truck is accelerating ...");
	}
	public void brake() {
		System.out.println("A " + this.getColor() + " " + this.getManufacture() + " truck is slowing down ...");
	}

	@Override
	public String toString() {
		return "Vehicle Type: Truck\n" + 
				"Vehicle Manufacturer: " + this.getManufacture() + "\n" +
				"Vehicle Color: " + this.getColor() + "\n" +
				"Number of Cylinders: " + this.getCylinderNumber() + "\n" +
				"Owner: " + this.getOwner().toString() + "\n" +
				"Load Capacity: " + this.getLoadCapacity() + "\n" +
				"Towing Capacity: " + this.getTowingCapacity() + "\n";
	}

	public boolean equals(Object object){
		if (object instanceof Truck){
			Truck otherTruck = (Truck)object;
			if (this.getColor() == otherTruck.getColor() && 
				this.getManufacture() == otherTruck.getManufacture() && 
				this.getLoadCapacity() == otherTruck.getLoadCapacity() &&
				this.getTowingCapacity() == otherTruck.getTowingCapacity() &&
				this.getCylinderNumber() == otherTruck.getCylinderNumber() &&
				this.getOwner().equals(otherTruck.getOwner())){
				return true;
			}
		}
		return false;
	}
}
