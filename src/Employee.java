import java.util.Date;

public class Employee {
    private String name;
    private int birthYear;
    private double monthlySalary;
    private int rate;
    private int age;

    public Employee(String name, int birthYear, double monthlySalary, int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
        this.age = 2023 - birthYear;
    }

}
