public class Tester extends Employee{
    private int numberOfBugs;


    public Tester(String name, int birthYear, double occupationRate, int numberOfBugs) {
        super(name, birthYear, occupationRate);
        this.numberOfBugs = numberOfBugs;
    }


    public Tester(String name, int birthYear,int numberOfBugs, double occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        this.numberOfBugs = numberOfBugs;
    }

    public int getNumberOfBugs() {
        return numberOfBugs;
    }

    @Override
    public double annualIncome() {
        return super.annualIncome() + this.getNumberOfBugs()*10;
    }
}
