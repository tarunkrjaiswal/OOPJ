import java.util.Scanner;

abstract class student {
    int roll, reg;

    public void getinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll: ");
        roll = sc.nextInt();
        System.out.println("Enter registration no.: ");
        reg = sc.nextInt();
        sc.close();
    }

    public abstract void course();
}

class kiitian extends student {
    public void course() {
        System.out.println("B.Tech. (Computer Science & Engg)");
    }
}

public class P1 {
    public static void main(String[] args) {
        kiitian k = new kiitian();
        k.getinput();
        System.out.println("Roll no. " + k.roll);
        System.out.println("Registration no. " + k.reg);
        k.course();
    }
}
