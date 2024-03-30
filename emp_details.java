import java.time.LocalDate;
import java.time.Period;

class Person {
    protected String name;
    protected LocalDate dateOfBirth;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayPersonName() {
        System.out.println("Person Name: " + name);
    }

    public void displayPersonAge() {
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(dateOfBirth, currentDate);
        int years = age.getYears();
        System.out.println("Person Age: " + years + " years");
    }
}

class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, LocalDate dateOfBirth, int empId, double salary) {
        super(name, dateOfBirth);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonName();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }
}

public class emp_details {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1990, 5, 15); // Example date of birth (YYYY, MM, DD)
        Employee employee = new Employee("John Doe", dob, 1001, 50000.0);
        employee.displayEmployeeDetails();
    }
}
