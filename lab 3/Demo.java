import java.util.Scanner;

class Box {
    int length, breadth, height;

    Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public int volume() {
        return length * breadth * height;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the box: ");
        int l = sc.nextInt();

        System.out.print("Enter the width of the box: ");
        int b = sc.nextInt();

        System.out.print("Enter the height of the box: ");
        int h = sc.nextInt();

        Box box = new Box(l, b, h);
        System.out.println("The volume of the box is: " + box.volume());
        sc.close();
    }
}
