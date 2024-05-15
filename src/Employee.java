import java.time.Period;

public class Employee {
    private final String name;
    private final int birthYear;
    private double monthlyIncome;
    private double occupationRate;
    private Vehicle vehicle;
    private Contract contract;


    // Constructors
    public Employee(String name, int birthYear) {
        this(name, birthYear, 0, 100, null);
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this(name, birthYear, 0, 100, vehicle);
    }

    public Employee(String name, int birthYear, double occupationRate) {
        this(name, birthYear, 0, 100, null);

    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate) {
        this(name, birthYear, monthlyIncome, occupationRate, null);
    }

    public Employee(String name, int birthYear, double occupationRate, Vehicle vehicle) {
        this(name, birthYear,0, occupationRate,null );
    }

    public String contractInfo() {
        return null;
    }

    public Employee(String name, int birthYear, double monthlyIncome, double occupationRate, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlyIncome = monthlyIncome;
        this.vehicle = vehicle;
        if(occupationRate < 10){
            this.occupationRate = 10;
        } else if (occupationRate > 100) {
            this.occupationRate = occupationRate;
        }else{
            this.occupationRate = 100;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int calculateAge() {
        return 2024 - birthYear;
    }
    public double annualIncome(){
        return monthlyIncome * 12;
    }
    public void signContract(Contract contract){
        this.contract = contract;
    }


}
