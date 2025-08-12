
class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

class P4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Subtract (int): " + calc.subtract(10, 5));
        System.out.println("Subtract (double): " + calc.subtract(10.5, 5.2));
        System.out.println("Subtract (three int): " + calc.subtract(20, 5, 3));
    }
}