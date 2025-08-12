import java.util.*;

class Rect {
    double length, breadth;

    Rect() {
        this.length = 0;
        this.breadth = 0;
    }

    Rect(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double area() {
        return length * breadth;
    }
}

public class P6 {
    public static void main(String[] args) {
        Rect rect1 = new Rect();
        System.out.println("Default Area: " + rect1.area());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        Rect rect2 = new Rect(length, breadth);
        sc.close();
        System.out.println("Parameterized Area: " + rect2.area());
    }
}
