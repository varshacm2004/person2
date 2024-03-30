import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

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

    public static void main(String[] args) {
        // Example usage
        LocalDate dob = LocalDate.of(1990, 5, 15); // Example date of birth (YYYY, MM, DD)
        Person person = new Person("Alice", dob);
        person.displayPersonName();
        person.displayPersonAge();
    }
}
