class Permanent implements Contract {
    private int numChildren;
    private boolean married;
    private double monthlySalary;
    private double bonusPerChildPerMonth;
    private int accumulatedDays;

    // Constructor for Permanent contract
    public Permanent(int numChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        this.numChildren = numChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    public double accumulatedSalary() {
        double childBonus = (married) ? (numChildren * bonusPerChildPerMonth) : 0;
        return (accumulatedDays * (monthlySalary + childBonus)) / Management.workingDaysPerMonth;
    }

    // Getters and setters for Permanent contract attributes
    // ...
}