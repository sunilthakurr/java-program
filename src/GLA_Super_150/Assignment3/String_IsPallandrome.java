package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class String_IsPallandrome {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        System.out.println(isPallandrome(str));

    }

    public static boolean isPallandrome(String str) {
        int len = str.length();
        for (int i = 0; i <= len / 2; ++i) {
            if (str.charAt(i) != str.charAt(len - 1 - i))
                return false;
        }
        return true;
    }
}

