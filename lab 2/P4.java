import java.util.Scanner;

// Program to find no. of objects created out of a class using ‘static’ modifier.
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects to create: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new Counter();
        }

        System.out.println("Number of objects created: " + Counter.count);
        sc.close();
    }
}
