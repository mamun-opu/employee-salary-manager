public class Tester extends Employee {
    private int nbBugs;
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs) {
        super(name, birthYear, monthlySalary);
        if(IsValidateInputs(nbBugs)){
            this.nbBugs = nbBugs;
        }else {
            throw new IllegalArgumentException("invalid input for bug number");
        }
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, int rate) {
        super(name, birthYear, monthlySalary, rate);
        if(IsValidateInputs(nbBugs)){
            this.nbBugs = nbBugs;
        }else {
            throw new IllegalArgumentException("invalid input for bug number");
        }
        System.out.println(", tester!");
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, Vehicle vehicle) {
        super(name, birthYear, monthlySalary, vehicle);
        if(IsValidateInputs(nbBugs)){
            this.nbBugs = nbBugs;
        }else {
            throw new IllegalArgumentException("invalid input for bug number");
        }
        System.out.println(", tester!");
    }
    public Tester(String name, int birthYear, double monthlySalary, int nbBugs, Vehicle vehicle, int rate) {
        super(name, birthYear, monthlySalary, vehicle, rate);
        if(IsValidateInputs(nbBugs)){
            this.nbBugs = nbBugs;
        }else {
            throw new IllegalArgumentException("invalid input for bug number");
        }
        System.out.println(", tester!");
    }
    private boolean IsValidateInputs(int nbBugs) {
        return nbBugs >= 0;
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
