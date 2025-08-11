import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] element = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element");
            element[i] = sc.nextInt();
        }
        System.out.println("Array elements are ");
        for (int i = 0; i < size; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println("\nSorted Array elements are ");
        Arrays.sort(element);
        for (int i = 0; i < size; i++) {
            System.out.print(element[i] + " ");
        }

        sc.close();
    }
}
