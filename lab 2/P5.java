import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // to group same numbers together

        System.out.println("Occurrences of each element:");
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + " appears " + count + " times");
        }

        sc.close();
    }
}
