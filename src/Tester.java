public class Tester extends Employee {
    private int nbBugs;
    public Tester(String name, int birthYear, double monthlySalary, int rate, int nbBugs) {
        super(name, birthYear, monthlySalary, rate);
        this.nbBugs = nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    public int getNbBugs() {
        return nbBugs;
    }
}
