/* 
i)	Change the case of the string
ii)	Reverse the string
iii)	Compare two strings
iv)	Insert one string into another string
v)	Convert the string to upper case and lower case
vi)	Check whether the character is present in the string and at which position
vii)	Check whether the string is palindrome or not.
viii)	Check the number of word, vowel and consonant in the string
*/

import java.util.*;

class String2 {
    public String s1, s2, s3, rev;

    void lower() {
        String s1lower = s1.toLowerCase();
        System.out.println("Input string in lowercase is " + s1lower);
    }

    void upper() {
        String s1upper = s1.toUpperCase();
        System.out.println("Input string in uppercase is " + s1upper);
    }

    void reverse() {
        rev = new StringBuilder(s1).reverse().toString();
        System.out.println("Input string reversed is " + rev);
    }

    void compare() {
        System.out.println("Result if strings are equal " + s1.equals(s2));
    }

    void concat() {
        System.out.println("Concatenated String: " + s1 + s2);
    }

    void contains() {
        System.out.println("Result if string contains the charachter/string " + s1.contains(s3));
        if (s1.contains(s3) == true) {
            System.out.println("Position of the string/charachter " + s1.indexOf(s3));
        }
    }

    void palindrome() {
        if (rev.equals(s1)) {
            System.out.println("The 1st String is a palindrome");
        } else {
            System.out.println("The 1st String is not a palindrome");
        }
    }

    void count() {
        int vowels = 0, consonants = 0, words = 0;
        String[] wordArray = s1.trim().split("\\s+");
        words = wordArray.length;

        for (char c : s1.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of words: " + words);
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}

public class P1 {
    public static void main(String args[]) {
        String2 q = new String2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        q.s1 = sc.nextLine();
        System.out.println("Enter 2nd string: ");
        q.s2 = sc.nextLine();
        System.out.println("Enter charachter to search : ");
        q.s3 = sc.nextLine();
        q.lower();
        q.upper();
        q.reverse();
        q.compare();
        q.concat();
        q.contains();
        q.palindrome();
        q.count();
        sc.close();
    }
}
