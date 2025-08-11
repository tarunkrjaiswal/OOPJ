import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        int i, j;

        System.out.println("enter elements ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("the array is ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int lsum = 0, rsum = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i == j) {
                    lsum = lsum + a[i][j];
                }

            }

        }
        System.out.print("left diagonal sum is " + lsum);
        System.out.println();

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (i + j == n - 1) {
                    rsum = rsum + a[i][j];
                }

            }

        }
        System.out.print("right diagonal sum is " + rsum);
    }
}
