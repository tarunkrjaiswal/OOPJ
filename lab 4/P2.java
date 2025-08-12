import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate Dimensions: " + length + " x " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);
        height = h;
        System.out.println("Box Dimensions: " + length + " x " + width + " x " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);
        thickness = t;
        System.out.println(
                "WoodBox Dimensions: " + length + " x " + width + " x " + height + " (Thickness: " + thickness + ")");
    }
}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and width of Plate:");
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        System.out.println("Enter height of Box:");
        double height = sc.nextDouble();

        System.out.println("Enter thickness of WoodBox:");
        double thickness = sc.nextDouble();

        WoodBox wb = new WoodBox(length, width, height, thickness);

        sc.close();
    }
}
