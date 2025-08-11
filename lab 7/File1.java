/*Write a java program which will accept students details like Student RollNo, Name, 
Subject, Marks from the keyboard using scanner class, stored the same in a file.
 Again open the file, read the content and display all.  */

import java.util.*;
import java.io.*;

public class File1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details (roll , name , subject , marks)");
        int roll = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        String subject = sc.nextLine();
        int marks = sc.nextInt();
        sc.nextLine();
        try {
            FileWriter fw = new FileWriter("abc.txt");
            fw.write(roll + " " + name + " " + subject + " " + marks);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
        FileReader fr = new FileReader("abc.txt");
        int i;
        System.out.println("Content of the file is : ");
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
