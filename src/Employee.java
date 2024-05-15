import java.time.Period;

public class Employee {
    private final String name;
    private final int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private Vehicle vehicle;

    // Constructors
    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this(name, birthYear);
        this.vehicle = vehicle;
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this(name, birthYear);
        this.occupationRate = occupationRate;
    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this(name, birthYear, occupationRate);
        this.monthlyIncome = monthlyIncome;
    }

    public Employee(String name, int birthYear, double occupationRate, Vehicle vehicle) {
        this(name, birthYear, occupationRate);
        this.vehicle = vehicle;
    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate, Vehicle vehicle) {
        this(name, birthYear, occupationRate, vehicle);
        this.monthlyIncome = monthlyIncome;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int calculateAge() {
        return 2024 - birthYear;
    }
}
