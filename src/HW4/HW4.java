package HW4;

public class HW4 {
    public static void main(String[] args) {
        // Person class test
    	Person lee = new Person("Lee"); 
        Person jack = new Person("Jack");
    	// Person nullPerson = new Person(null); // CE
        
        System.out.println(lee.toString()); // Name: Lee
    	System.out.println(jack.toString()); // Name: Jack

        System.out.println("lee equal jack: " + lee.equals(jack)); // false
        System.out.println("lee equal lee: " + lee.equals(lee)); // true


        // Car class test
        Car c1 = new Car("Toyota", "White", 2, lee, "v1");
        System.out.println(c1.toString()); // Vehicle Type: Car ...
    	Car nullCar = new Car(null, null, 2, null, null);
        System.out.println(nullCar.toString()); // Vehicle Type: Car ...
        
        c1.gas(); // A White Toyota v1 is accelerating ...
        c1.brake(); // A White Toyota v1 is slowing down ...
        nullCar.gas(); // A N/A N/A N/A is accelerating ...
        nullCar.brake(); // A N/A N/A N/A is slowing down ...

        System.out.println("Car 1 equal Null Car: " + c1.equals(nullCar)); // false
        Car c2 = new Car("Toyota", "White", 2, lee, "v1");
        System.out.println("Car 1 equal Car 2: " + c1.equals(c2)); // true


        // Truck class test
        Truck t1 = new Truck("Ford", "Red", 4, jack, 2.5, 5000);
        Truck t2 = new Truck("Volvo", "Blue", 4, lee, 3.5, 6000);
        Truck nullTruck = new Truck(null, null, 0, null, 0.0, 0);

        System.out.println(t1.toString()); // Vehicle Type: Truck ...
        System.out.println(t2.toString()); // Vehicle Type: Truck ...
        System.out.println(nullTruck.toString()); // Vehicle Type: Truck ...
        
        t1.gas(); // A Red Ford truck is accelerating ...
        t1.brake(); // A Red Ford truck is slowing down ...
        t2.gas(); // A Blue Volvo truck is accelerating ...
        t2.brake(); // A Blue Volvo truck is slowing down ...
        nullTruck.gas(); // A N/A N/A truck is accelerating ...
        nullTruck.brake(); // A N/A N/A truck is slowing down ...

        System.out.println("Truck 1 equal Truck 2: " + t1.equals(t2)); // false
        Truck t3 = new Truck("Ford", "Red", 4, jack, 2.5, 5000);
        System.out.println("Truck 1 equal Truck 3: " + t1.equals(t3)); // true
        System.out.println("Truck 1 equal Null Truck: " + t1.equals(nullTruck)); // false
    }

}
