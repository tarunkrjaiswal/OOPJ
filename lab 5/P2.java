// Interface
interface Motor {
    int capacity = 100;

    void run();

    void consume();
}

// Implementing Class
class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running...");
    }

    public void consume() {
        System.out.println("Consuming power...");
    }

    void displayCapacity() {
        System.out.println("Capacity of the motor is: " + capacity);
    }
}

// Driver Class
public class P2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}
