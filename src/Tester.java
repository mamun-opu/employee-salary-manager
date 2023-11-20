public class Tester extends Employee {
    private int nbBugs;
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs) {
        super(name, birthYear, monthlySalary);
        this.nbBugs = nbBugs;
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, int rate) {
        super(name, birthYear, monthlySalary, rate);
        this.nbBugs = nbBugs;
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, Vehicle vehicle) {
        super(name, birthYear, monthlySalary, vehicle);
        this.nbBugs = nbBugs;
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, Vehicle vehicle, int rate) {
        super(name, birthYear, monthlySalary, vehicle, rate);
        this.nbBugs = nbBugs;
    }
    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    @Override
    double annualIncome() {
        int gain_factor_error = 10;

        return nbBugs * gain_factor_error;
    }
}
