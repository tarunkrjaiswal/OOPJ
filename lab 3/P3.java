import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", CGPA: " + s.cgpa);
        }

        // Find student with lowest CGPA
        double minCgpa = students[0].cgpa;
        String minName = students[0].name;
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minName = students[i].name;
            }
        }
        System.out.println("\nStudent with lowest CGPA: " + minName);
        sc.close();
    }
}