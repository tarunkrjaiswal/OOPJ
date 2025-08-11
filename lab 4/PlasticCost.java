import java.util.Scanner;

class Plastic2D {
    double length, width;
    static final int cost = 40;

    Plastic2D(double l, double w) {
        length = l;
        width = w;
    }

    double calculateCost() {
        return length * width * cost;
    }
}

class Plastic3D extends Plastic2D {
    double height;
    static final int cost = 60;

    Plastic3D(double l, double w, double h) {
        super(l, w);
        height = h;
    }

    double calculateCost() {
        return length * width * height * cost;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width of 2D sheet:");
        double length2D = sc.nextDouble();
        double width2D = sc.nextDouble();
        Plastic2D sheet = new Plastic2D(length2D, width2D);
        System.out.println("Cost of 2D Sheet: Rs. " + sheet.calculateCost());

        System.out.println("\nEnter length, width, and height of 3D box:");
        double length3D = sc.nextDouble();
        double width3D = sc.nextDouble();
        double height3D = sc.nextDouble();
        Plastic3D box = new Plastic3D(length3D, width3D, height3D);
        System.out.println("Cost of 3D Box: Rs. " + box.calculateCost());

        sc.close();
    }
}
