import java.util.*;

public class P2 {
    public static void main(String[] args) {
        int num = 0;
        int evenc = 0, oddc = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number");
            num = sc.nextInt();
            if (num % 2 == 0) {
                evenc++;
            } else {
                oddc++;
            }
        }
        System.err.println("No. of even numbers = " + evenc + "\nNo. of odd numbers = " + oddc);
        sc.close();
    }
}
