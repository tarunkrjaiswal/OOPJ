
import Marketing.Sales;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Sales s = new Sales();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();
        s.getInput(id, name, salary);
        s.displayTotalEarnings();

        sc.close();
    }
}
