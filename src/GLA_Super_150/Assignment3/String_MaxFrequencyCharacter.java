package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class String_MaxFrequencyCharacter {
    static final int ASCII_SIZE = 256;

    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        System.out.println(getMaxOccurringChar(str));

    }

    public static char getMaxOccurringChar(String str) {
        // Create array to keep the count of individual
        // characters and initialize the array as 0
        int count[] = new int[ASCII_SIZE];

        // Construct character count array from the input
        // string.
        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }
}
