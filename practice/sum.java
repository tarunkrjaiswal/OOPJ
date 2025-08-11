
import java.util.*;

public class sum {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is " + sum);
        sc.close();
    }
}
