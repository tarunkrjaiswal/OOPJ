import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input(Scanner sc) {
        super.input(sc); // Call input method of Account class
        sc.nextLine(); // Consume the leftover newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    void display() {
        super.display(); // Call disp method of Account class
        System.out.println("Name: " + name);
        System.out.println("Aadhar No: " + aadhar_no);
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDisplaying Person Details:");
        for (Person p : persons) {
            System.out.println();
            p.display();
        }

        sc.close();
    }
}
