import java.util.*;

class StringOperations {

    // Change the case of the string
    void changeCase(String s) {
        StringBuilder changed = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                changed.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                changed.append(Character.toUpperCase(c));
            } else {
                changed.append(c);
            }
        }
        System.out.println("String with case changed: " + changed);
    }

    // Reverse the string
    void reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed string: " + sb.reverse());
    }

    // Compare two strings
    void compareStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }
    }

    // Insert one string into another at a specific position
    void insertString(String s1, String s2, int pos) {
        if (pos < 0 || pos > s1.length()) {
            System.out.println("Invalid position for insertion.");
            return;
        }
        String result = s1.substring(0, pos) + s2 + s1.substring(pos);
        System.out.println("String after insertion: " + result);
    }

    // Convert the string to upper case and lower case
    void convertCase(String s) {
        System.out.println("String in uppercase: " + s.toUpperCase());
        System.out.println("String in lowercase: " + s.toLowerCase());
    }

    // Check if a character is in the string and its position
    void findCharacter(String s, char c) {
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println("Character '" + c + "' found at position: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Character '" + c + "' is not found in the string.");
        }
    }

    // Check if the string is a palindrome
    void checkPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Count the number of words, vowels, and consonants in the string
    void countWordsVowelsConsonants(String s) {
        int vowels = 0, consonants = 0, words = 0;
        String[] wordArray = s.trim().split("\\s+");
        words = wordArray.length;

        for (char c : s.toLowerCase().toCharArray()) {
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

public class StringHandler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringOperations operations = new StringOperations();

        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.println("Enter another string for comparison or insertion: ");
        sc.nextLine(); // Consume leftover newline
        String input2 = sc.nextLine();

        System.out.println("Enter the position to insert the second string into the first: ");
        int position = sc.nextInt();

        // Perform operations
        operations.changeCase(input);
        operations.reverse(input);
        operations.compareStrings(input, input2);
        operations.insertString(input, input2, position);
        operations.convertCase(input);
        operations.findCharacter(input, c);
        operations.checkPalindrome(input);
        operations.countWordsVowelsConsonants(input);

        sc.close();
    }
}
