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

//    public double accumulatedSalary() {
//        double childBonus = (married) ? (numChildren * bonusPerChildPerMonth) : 0;
//        return (accumulatedDays * (monthlySalary + childBonus)) / Management.workingDaysPerMonth;
//    }
    @Override
    public double accumulatedSalary() {
        return 0;
    }


    public void setAccumulatedDays(int accumulatedDays) {
        this.accumulatedDays = accumulatedDays;
    }

    public void setBonusPerChildPerMonth(double bonusPerChildPerMonth) {
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public boolean isMarried() {
        return married;
    }

    public double getBonusPerChildPerMonth() {
        return bonusPerChildPerMonth;
    }

    public int getAccumulatedDays() {
        return accumulatedDays;
    }

    public int getNumChildren() {
        return numChildren;
    }


}