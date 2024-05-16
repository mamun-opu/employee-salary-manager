import java.io.PrintStream;

public class Employee {
    private final String name;
    private final int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private Vehicle vehicle;
    private Contract contract;

    public Employee(String name, int birthYear) {
        this(name, birthYear, 0.0, 100.0, null);
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this(name, birthYear, 0.0, 100.0, vehicle);
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this(name, birthYear, 0.0, occupationRate, null);
    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this(name, birthYear, monthlyIncome, occupationRate, null);
    }

    public Employee(String name, int birthYear, double occupationRate, Vehicle vehicle) {
        this(name, birthYear, 0.0, occupationRate, vehicle);
    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.vehicle = vehicle;
        setOccupationRate(occupationRate);
        PrintStream out = System.out;
        out.println("We have a new employee: " + getName() + ", " + getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public String contractInfo() {
        return contract.contractInfo();
    }

    public int calculateAge() {
        return 2024 - birthYear;
    }

    public double annualIncome() {
        return monthlyIncome * 12.0;
    }

    public void signContract(Contract contract) {
        this.contract = contract;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setOccupationRate(double occupationRate) {
        if (occupationRate < 10.0) {
            this.occupationRate = 10.0;
        } else if (occupationRate > 100.0) {
            this.occupationRate = 100.0;
        } else {
            this.occupationRate = occupationRate;
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", a " + getClass().getSimpleName() + "\n" + String.valueOf(getVehicle());
    }
}
