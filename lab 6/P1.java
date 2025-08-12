//ArrayIndexOutofBoundsException and handle it using catch statement.

import java.util.Scanner;

class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        System.out.print("Enter the numbers: ");
        try {
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        scanner.close();
    }
}