package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                char ch = (char) (str.charAt(i) + 32);
                System.out.print(ch);
            } else {
                char ch = (char) (str.charAt(i) - 32);
                System.out.print(ch);
            }
        }
    }
}
