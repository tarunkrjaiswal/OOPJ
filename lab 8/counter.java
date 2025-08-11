
/*
 * Write a program in Java using multi-threading which will display a counter
 * value within a specified range with a gap of 5 milliseconds after setting
 * it’s name as given by the user.
 * Input : Name of the thread - First
 * Lower range of counter - 10
 * Upper range of counter - 15
 * Output : Thread - First
 * Counter - 10 11 12 13 14 15
 */
import java.util.*;

class counter implements Runnable {
    private int lower, upper;

    public counter(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public void run() {
        System.out.print("Counter - ");
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of the thread: ");
        String threadName = sc.nextLine();

        System.out.print("Enter lower range of counter: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range of counter: ");
        int upper = sc.nextInt();

        Thread t = new Thread(new counter(lower, upper), threadName);
        System.out.println("Thread - " + t.getName());
        t.start();
        sc.close();
    }
}
