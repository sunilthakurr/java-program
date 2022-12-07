package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class LengthOfLongestSubstringWithoutRepeatingCharacter {
    public static int longestUniqueSubsttr(String str) {
        String test = "";
        int maxLength = -1;

        if (str.isEmpty()) {
            return 0;
        } else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // System.out.println(str);

        int len = longestUniqueSubsttr(str);
        System.out.println(len);
    }
}
