import java.util.Date;

abstract class Employee {
    private final String name;
    private int birthYear;
    private double monthlySalary;
    private int rate;
    private int age;
    private Contract contract;
    private Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlySalary, int rate) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = rate;
        this.age = 2023 - birthYear;
    }
    public void signContract(Contract newContract) {
        this.contract = newContract;
    }
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
        this.age = 2023 - birthYear;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    public String contractInfo() {
        if (contract != null) {
            return "Contract details: " + contract.toString(); // Example method to show contract details
        }
        return "No contract information available";
    }
    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getRate() {
        return rate;
    }
    abstract double annualIncome();
}
