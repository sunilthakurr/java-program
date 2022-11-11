package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class Strings_StringCompression {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        char[] arr = str.toCharArray();
        System.out.println(compress(arr));


    }

    public static String compress(char[] chars) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        sb.insert(0, chars[0]);
        int c = 1;
        for (int i = 1; i < n; i++) {

            char curr = chars[i];
            char prev = chars[i - 1];
            if (curr == prev) {
                c++;
            } else {
                if (c > 1) {
                    sb.append(c);
                    c = 1;
                }
                sb.append(curr);
            }

        }
        if (c > 1) {
            sb.append(c);
        }
        n = sb.length();
        for (int i = 0; i < n; i++) {
            str = str + sb.charAt(i);
        }
        return str;
    }
}
