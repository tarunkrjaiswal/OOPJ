
import java.util.Scanner;

class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        try {
            int quotient = dividend / divisor;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            scanner.close();
        }
    }
}