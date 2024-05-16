public class Permanent implements Contract {
    private int workingDays;
    private double monthlySalary;
    private int children;
    private boolean civilStatus;
    private double monthlyPremium;

    public Permanent(int children, boolean civilStatus, double monthlySalary, double monthlyPremium, int workingDays) {
        this.workingDays = workingDays;
        this.monthlySalary = monthlySalary;
        this.children = children;
        this.civilStatus = civilStatus;
        this.monthlyPremium = monthlyPremium;
    }

    public double accumulatedSalary() {
        return ((double) children * monthlyPremium + monthlySalary) * (double) workingDays / 20.0;
    }

    public String contractInfo() {
        String civilStatusStr = civilStatus ? "is married" : "is not married";
        return String.format("He/She %s and has %d children. \nHe/She has worked for %d days, and upon contract, the monthly salary is %.2f\n", civilStatusStr, children, workingDays, accumulatedSalary());
    }

    @Override
    public String toString() {
        return "Permanent{workingDays=" + workingDays + ", monthlySalary=" + monthlySalary + ", children=" + children + ", civilStatus='" + civilStatus + "', monthlyPremium=" + monthlyPremium + "}";
    }
}
