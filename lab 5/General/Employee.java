package General;

public class Employee {
    protected int empId;
    private String empName;
    protected double basic;

    public void getInput(int id, String name, double salary) {
        empId = id;
        empName = name;
        basic = salary;
    }

    public double earnings() {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public void display() {
        System.out.println("Emp ID: " + empId);
    }
}
