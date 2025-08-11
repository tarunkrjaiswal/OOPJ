import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check : ");
        int flag = 0;
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("1 is neither prime nor composite");
        }
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        if (flag > 1) {
            System.out.println(n + " is not a prime number");
        } else if (n != 1 && flag <= 1) {
            System.out.println(n + " is a prime number");
        }
        sc.close();
    }
}
