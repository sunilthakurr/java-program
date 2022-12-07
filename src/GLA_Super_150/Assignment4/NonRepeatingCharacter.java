package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class NonRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            char ch = '#';
            int flag1 = 0;
            for (int j = 0; j < s.length(); j++) {
                int flag = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(j) == s.charAt(k) && k != j) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    ch = s.charAt(j);
                    flag1 = 1;
                    break;
                }
            }
            if (flag1 == 1) {
                System.out.println(ch);
            } else {
                System.out.println(-1);
            }
        }


    }
}
