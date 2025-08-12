
class Area {
    double calculate(double radius) {
        return 3.14 * radius * radius;
    }

    double calculate(double base, double height) {
        return 0.5 * base * height;
    }

    double calculate(int side) {
        return side * side;
    }
}

public class P5 {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.calculate(5));
    }
}