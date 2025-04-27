abstract class Vehicle {
    public abstract int getWheelCount();
    public abstract int getMaxSpeed();
}

class vehicleInfo{
  public void show(Vehicle v) {
    System.out.println("This is "+v.getClass().toString());
    System.out.println("The WheelCount is "+v.getWheelCount());
    System.out.println("The MaxSpeed is "+v.getMaxSpeed());
    System.out.println();
  }
}

class Car extends Vehicle {
  @Override
  public int getWheelCount() {
	  return 4;
  }

  @Override
  public int getMaxSpeed() {
    return 200;
  }
}

class Motorcycle extends Vehicle {
  @Override
  public int getWheelCount() {
    return 2;
  }

  @Override
  public int getMaxSpeed() {
    return 100;
  }

}

class Bicycle extends Vehicle {
  @Override
  public int getWheelCount() {
    return 2;
  }

  @Override
  public int getMaxSpeed() {
    return 30;
  }

}


public class Main {
    public static void main(String[] args) {
       Car car = new Car();
       Motorcycle motorcycle = new Motorcycle();
       Bicycle bicycle = new Bicycle();
       vehicleInfo vI = new vehicleInfo();
       vI.show(car);
       vI.show(bicycle);
       vI.show(motorcycle);
    }
}

