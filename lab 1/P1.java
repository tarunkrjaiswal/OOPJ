import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll: ");
        int roll = sc.nextInt();
        System.out.print("Enter Section: ");
        int section = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        sc.close();
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
