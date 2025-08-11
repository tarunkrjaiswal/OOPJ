import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number (1-31): ");
        int dayNumber = sc.nextInt();
        int weekDay = (dayNumber + 3) % 7; // 0 for sunday and +x depending on first day of month

        switch (weekDay) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 0:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        sc.close();
    }
}
