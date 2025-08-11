import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Input Marks\n0. Stop");
        System.out.print("Enter option: ");
        int i = sc.nextInt();
        do {
            System.out.println("Enter marks out of 100: ");
            int m = sc.nextInt();
            if (m >= 90) {
                System.out.println("This is Good");
            } else if (m >= 60 && m <= 89) {
                System.out.println("This is also good");
            } else {
                System.out.println("This is Good as well");
            }
            System.out.println("continue?\n1 for yes\n0 for no");
            i = sc.nextInt();
        } while (i == 1);

        sc.close();
    }
}
