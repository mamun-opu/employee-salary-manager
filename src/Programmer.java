public class Programmer extends Employee{
    private int nbProjects;
    public Programmer(String name, int birthYear, double monthlySalary, int rate, int nbProjects) {
        super(name, birthYear, monthlySalary, rate);
        this.nbProjects = nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }

    public int getNbProjects() {
        return nbProjects;
    }

    @Override
    double annualIncome() {
        int gain_factor_projects = 200;
        return nbProjects * gain_factor_projects;
    }
}
