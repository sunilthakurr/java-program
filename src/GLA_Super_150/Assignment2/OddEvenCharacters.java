package GLA_Super_150.Assignment2;

import java.util.Scanner;

public class OddEvenCharacters {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);
        String Str = obj.next();
        String st = "";
        for (int i = 0; i < Str.length(); ++i) {
            if (i % 2 == 0) {
                int n = Str.charAt(i);
                n += 1;
                st += (char) n;
            } else {
                int n = Str.charAt(i);
                n -= 1;
                st += (char) n;
            }
        }
        System.out.println(st);
    }
}

