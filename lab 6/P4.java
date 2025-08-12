//Question 4

import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    SecException(String message) {
        super(message);
    }
}

class P4 {
    int hours, minutes, seconds;

    P4(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            inputTime();
        } catch (HrsException e) {
            System.out.println(e);
        } catch (MinException e) {
            System.out.println(e);
        } catch (SecException e) {
            System.out.println(e);
        }
        scanner.close();
    }

    static void inputTime() throws HrsException, MinException, SecException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        scanner.close();
        int flag = 0;
        if (hours > 24 || hours < 0) {
            flag++;
            throw new HrsException("Invalid hours");
        }
        if (minutes > 60 || minutes < 0) {
            flag++;
            throw new MinException("Invalid minutes");
        }
        if (seconds > 60 || seconds < 0) {
            flag++;
            throw new SecException("Invalid seconds");
        }
        if (flag == 0) {
            System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
        }
    }
}