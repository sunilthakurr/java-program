package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class StringCompression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = "";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                s += str.charAt(i);
                s += String.valueOf(count);
                count = 1;
            }

        }
        //stop the process

        s += str.charAt(str.length() - 1);
        s += String.valueOf(count);

        System.out.println(s);

    }
}
