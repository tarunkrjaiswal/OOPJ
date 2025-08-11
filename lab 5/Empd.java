import java.util.Scanner;

// Base Interface
interface Employee {
    void getDetails();
}

// Derived Interface
interface Manager extends Employee {
    void getDeptDetails();
}

// Implementing Class
class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        sc.close();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department ID: ");
        deptId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();
        sc.close();
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}

// Driver Class
public class Empd {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}
