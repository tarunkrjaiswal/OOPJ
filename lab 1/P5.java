import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = sc.nextLine();
        System.out.println("Enter last name: ");
        String last = sc.nextLine();
        sc.close();
        System.out.println(last + " " + first);
    }
}
