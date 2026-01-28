class Employee {
    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    public double calculateSalary() {
        return 50000.0; 
    }
}

class PartTimeEmployee extends Employee {
    public double calculateSalary() {
        int hour = 80;
        double rate = 500;
        return hour * rate;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full Time Salary: " + e.calculateSalary());

        e = new PartTimeEmployee();
        System.out.println("Part Time Salary: " + e.calculateSalary());
    }
}
