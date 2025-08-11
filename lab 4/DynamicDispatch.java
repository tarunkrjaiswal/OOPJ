class Apple {
    void show() {
        System.out.println("This is Apple class");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Apple ref; // Reference of type Apple

        ref = new Apple();
        ref.show(); // Calls Apple’s show()

        ref = new Banana();
        ref.show(); // Calls Banana’s show() (Dynamic Method Dispatch)

        ref = new Cherry();
        ref.show(); // Calls Cherry’s show() (Dynamic Method Dispatch)
    }
}
