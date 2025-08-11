abstract class animal {
    public abstract void animalsound();

    public void sleep() {
        System.out.println("Zzz");
    }
}

class pig extends animal {
    public void animalsound() {
        System.out.println("The pig says : wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        pig p = new pig();
        p.animalsound();
        p.sleep();
    }
}
