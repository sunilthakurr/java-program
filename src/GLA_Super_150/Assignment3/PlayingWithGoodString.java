package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class PlayingWithGoodString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        System.out.println(longestSubString(str));
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public static int longestSubString(String str) {
        int count = 0;
        int res = 0;
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; ++i) {
            if (isVowel(ch[i])) {
                ++count;
            } else {
                res = Math.max(count, res);
                count = 0;
            }
        }
        res = Math.max(count, res);

        return res;
    }
}
