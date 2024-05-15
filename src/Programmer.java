public class Programmer extends Employee{
    private int numberOfProjects;

    public Programmer(String name, int birthYear, int numberOfProjects) {
        super(name, birthYear);
        this.numberOfProjects = numberOfProjects;
    }

    public Programmer(String name, int birthYear, int numberOfProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.numberOfProjects = numberOfProjects;
    }

    public Programmer(String name, int birthYear, double occupationRate, int numberOfProjects) {
        super(name, birthYear, occupationRate);
        this.numberOfProjects = numberOfProjects;
    }

    public Programmer(String name, int birthYear, int numberOfProjects, double occupationRate, Vehicle vehicle) {
        super(name, birthYear, occupationRate, vehicle);
        this.numberOfProjects = numberOfProjects;
    }

}
