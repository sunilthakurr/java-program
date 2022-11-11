package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class DifferenceOfAsciiCode {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String st = "";
        for (int i = 1; i < str.length(); ++i) {
            st += str.charAt(i - 1);

            int count = str.charAt(i) - str.charAt(i - 1);
            st += count;


        }
        st += str.charAt(str.length() - 1);
        System.out.println(st);

    }
}

