
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st no.: ");
        int a = sc.nextInt();
        System.out.print("enter 2nd no.: ");
        int b = sc.nextInt();
        System.out.println(
                " List of Available Operations:\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Remainder");
        System.out.print("Select operation to perform : ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
