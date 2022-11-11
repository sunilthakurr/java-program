package GLA_Super_150.Assignment3;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String args[]) {
        // Your Code Here
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        String st = deleteConsecutive(str);
        System.out.println(st);

    }

    public static String deleteConsecutive(String str) {

        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return deleteConsecutive(str.substring(1));
        } else {
            return str.charAt(0) + deleteConsecutive(str.substring(1));
        }
    }
}
