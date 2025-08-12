/*-Write a java program that displays the number of characters, 
no. of lines and no. of words present in a text file whose name is given by the user. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (with .txt extension): ");
        String fileName = scanner.nextLine();
        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().isEmpty() ? new String[0] : line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}
