
public class circle {
    int radius;
    double area;

    void get(int r) {
        radius = r;
    }

    void areacalc() {
        area = 3.14 * radius;
    }

    void display() {
        System.out.println("area is = " + area);
    }

    public static void main(String args[]) {
        circle c = new circle(), c1 = new circle();
        c.get(5);
        c1.get(6);
        c1.areacalc();
        c.areacalc();
        c.display();
        c1.display();
    }
}
