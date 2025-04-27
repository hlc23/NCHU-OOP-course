import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract int getSalary();
}

class FixedSalaryEmployee extends Employee {
    private int fixedSalary;
    
    FixedSalaryEmployee(String name, String id, int fixSalary){
    	super(name, id);
    	this.fixedSalary = fixSalary;
    }
    
    @Override
    public int getSalary() {
    	return this.fixedSalary;
    }
}

class HourlySalaryEmployee extends Employee {
	private int hourlyRate;
	private int hoursWorked;
    
    HourlySalaryEmployee(String name, String id, int hourlyRate, int hoursWorked){
    	super(name, id);
    	this.hourlyRate = hourlyRate;
    	this.hoursWorked = hoursWorked;
    }
    
    @Override
    public int getSalary() {
    	return this.hourlyRate * this.hoursWorked;
    }
}


/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 讀取員工人數n
        int n = scanner.nextInt();

        // 創建一個員工列表
        ArrayList<Employee> employees = new ArrayList<>();

        // 讀取n個員工的資料
        for (int i = 0; i < n; i++) {
            // 讀取員工類型、姓名和ID
            String type = scanner.next();
            String name = scanner.next();
            String id = scanner.next();

            // 根據員工類型建立對應的員工物件，並加入到employees ArrayList中
            switch (type) {
                case "F":
                    // 讀取固定薪資員工的薪資
                    int fixedSalary = scanner.nextInt();
                    employees.add(new FixedSalaryEmployee(name, id, fixedSalary));
                    break;
                case "H":
                    // 讀取計時薪資員工的時薪和工作時數
                    int hourlyRate = scanner.nextInt();
                    int hoursWorked = scanner.nextInt();
                    employees.add(new HourlySalaryEmployee(name, id, hourlyRate, hoursWorked));
                    break;
            }
        }

        // 逐一輸出每個員工的姓名、ID和薪資
        for (Employee employee : employees) {
            System.out.printf("%s %s %d\n", employee.name, employee.id, employee.getSalary());
        }
    }
}
*/