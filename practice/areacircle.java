package practice;
import java.util.*;

public class areacircle {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius ");
        int r = sc.nextInt();
        double a = pi * r * r;
        System.out.println("area is: " + a);
        sc.close();
    }
}
