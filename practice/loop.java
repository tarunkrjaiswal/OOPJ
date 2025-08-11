import java.util.*;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter value of n: ");
        int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum = sum + i;
        // }
        // System.out.print("sum : " + sum);
        for (int i = 1; i <= 10; i++) {
            System.err.println(n + " X " + i + " = " + i * n);
        }
        sc.close();
    }
}
