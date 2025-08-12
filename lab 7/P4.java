/*Aim of the program -Write a java program to compare two binary files, printing the 
 first byte position where they differ.

 Input: Specify two binary files in the program (Assume two files  are exist in 
the 
system)
 Output: Two files are equal
 Input: Specify two binary files in the program
 Output: Two files are not equal: byte position at which two files differ is 30 */

import java.io.FileInputStream;

public class P4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("file1.bin");
            FileInputStream fis2 = new FileInputStream("file2.bin");
            int byte1, byte2;
            int position = 0;
            boolean areEqual = true;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    areEqual = false;
                    break;
                }
                position++;
            }

            if (areEqual) {
                System.out.println("Two files are equal");
            }

            fis1.close();
            fis2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
