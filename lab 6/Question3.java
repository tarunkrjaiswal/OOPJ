import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException(String message) {
        super(message);
    }
}

class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        try {
            ProcessInput(number);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }
        scanner.close();
    }

    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number should be positive");
        } else {
            System.out.println("Double value: " + number * 2);
        }
    }
}