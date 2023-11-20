public class Programmer extends Employee{
    private int nbProjects;
    public Programmer(String name, int birthYear, double monthlySalary, int nbProjects) {
        super(name, birthYear, monthlySalary);
        this.nbProjects = nbProjects;
        System.out.println(", programmer!");
    }
    public Programmer(String name, int birthYear, double monthlySalary, int nbProjects, int rate) {
        super(name, birthYear, monthlySalary, rate);
        this.nbProjects = nbProjects;
        System.out.println(", programmer!");
    }
    public Programmer(String name, int birthYear, double monthlySalary, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, monthlySalary, vehicle);
        this.nbProjects = nbProjects;
        System.out.println(", programmer!");
    }
    public Programmer(String name, int birthYear, double monthlySalary, int nbProjects, Vehicle vehicle, int rate) {
        super(name, birthYear, monthlySalary, vehicle, rate);
        this.nbProjects = nbProjects;
        System.out.println(", programmer!");
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
