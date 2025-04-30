class Car {
  public String serialNumber;

  public Car(String serialNumber) {
	  this.serialNumber = serialNumber;
  }

  public void validateSerialNumber() throws InvalidSerialNumberException {
	  if (this.serialNumber.length() >= 10 || this.serialNumber.length() <= 3) throw new InvalidSerialNumberException("Length error");
	  
	  for (int i=0; i<this.serialNumber.length(); i++) {
		  char c = this.serialNumber.charAt(i);
		  if (!( // not
				  (c >= '0' && c <= '9') || // is number 
				  (c >= 'A' && c <= 'z') || // is upper
				  (c >= 'a' && c <= 'z')  // is lower
			)) throw new InvalidSerialNumberException("Contains invalid characters");
	  }
	  
	  if (!(this.serialNumber.charAt(0) >= 'A' && this.serialNumber.charAt(0) <= 'Z' ))
		  throw new InvalidSerialNumberException("Must start with an uppercase letter");
  }
}

class InvalidSerialNumberException extends Exception {
	private String message;
	public InvalidSerialNumberException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return "Invalid serial number: "+this.message;
	}
	
}

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();

    Car car = new Car(input);

    try {

      car.validateSerialNumber();

      System.out.println("Serial number is valid");

    } catch (InvalidSerialNumberException e) {

      System.out.println(e.getMessage());
    }
  }
}