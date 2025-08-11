package Marketing;

import General.Employee;

public class Sales extends Employee {
    public double tAllowance() {
        return 0.05 * earnings();
    }

    public void displayTotalEarnings() {
        display();
        System.out.println("Total Earnings: " + (earnings()));
    }
}
