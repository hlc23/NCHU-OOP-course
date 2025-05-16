abstract class Payment {
	protected double amount;
	public Payment(double amount) {
		this.amount = amount;
	}
	public abstract String toString();
}

class Cash extends Payment {
    public Cash(double amount) {
    	super(amount);
    }

	@Override
	public String toString() {
		return "Cash amount: "+this.amount;
	}
    
}

class Check extends Payment {
	private String RoutingNumber;
	private String Name;
	public Check(double amount, String number, String name) {
		super(amount);
		this.RoutingNumber = number;
		this.Name = name;
	}

	@Override
	public String toString() {
		return "Check routing number: "+this.RoutingNumber+", Name on check: "+this.Name+", Amount: "+this.amount;
	}
	
	public String getNumber() {
		return this.RoutingNumber;
	}

	public void setNumber(String getNumber) {
		this.RoutingNumber = getNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}

class CreditCard extends Payment {
	private String Expiration;
	private String Name;
	private String Number;

	public CreditCard(double amount, String name, String number, String expiration) {
		super(amount);
		this.setName(name);
		this.setNumber(number);
		this.setExpiration(expiration);
	}

	public String getExpiration() {
		return Expiration;
	}

	public void setExpiration(String expiration) {
		Expiration = expiration;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "Credit Card number: "+this.Number+", Name on card: "+this.Name+", Expiration Date: "+this.Expiration+", Amount: "+this.amount;
	}
}

public class Main {
    public static void main(String[] args){
        Cash payment1 = new Cash(100);
        Check payment2 = new Check(50, "1501234121", "Joe King");
        CreditCard payment3 = new CreditCard(1000, "Barry Schmelly", "5142-4123-4231-3231", "10/06");

        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}