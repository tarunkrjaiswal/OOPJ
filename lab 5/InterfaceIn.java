import java.util.Scanner;

interface Employee {
    double earnings();

    double deductions();

    double bonus();
}

class Manager implements Employee {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public double earnings() {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public double deductions() {
        return 0.12 * basic;
    }

    public double bonus() {
        throw new UnsupportedOperationException("Bonus not applicable for Manager");
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public double bonus() {
        return 0.5 * basic;
    }
}

// Driver Class
public class InterfaceIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();
        Substaff staff = new Substaff(basic);
        System.out.println("Earnings: " + staff.earnings());
        System.out.println("Deductions: " + staff.deductions());
        System.out.println("Bonus: " + staff.bonus());
        sc.close();
    }
}
