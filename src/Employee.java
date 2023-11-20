abstract class Employee {
    private final String name;
    private int birthYear;
    private double monthlySalary;
    private int rate;
    private int age;
    private Contract contract;
    private Vehicle vehicle;

    public Employee(String name, int birthYear, double monthlySalary) {
        this.name = name;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.rate = 100;
        this.age = 2023 - birthYear;
        System.out.print("We have a new employee: " + this.name);
    }
    public Employee(String name, int birthYear, double monthlySalary, int rate) {
        this(name, birthYear, monthlySalary);
        if(rate < 10){
            this.rate = 10;
        } else this.rate = Math.min(rate, 100);
    }
    public Employee(String name, int birthYear, double monthlySalary, Vehicle vehicle, int rate) {
        this(name, birthYear, monthlySalary, rate);
        this.vehicle = vehicle;
    }
    public Employee(String name, int birthYear, double monthlySalary, Vehicle vehicle) {
        this(name, birthYear, monthlySalary);
        this.vehicle = vehicle;
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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

    public Vehicle getVehicle() {
        return vehicle;
    }

    abstract double annualIncome();
}
