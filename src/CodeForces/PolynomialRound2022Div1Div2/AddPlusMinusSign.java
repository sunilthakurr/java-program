package CodeForces.PolynomialRound2022Div1Div2;

import java.util.Scanner;

public class AddPlusMinusSign {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            String str = obj.next();
            int sum = 0;
            if (str.charAt(0) == '1')
                sum += 1;
            for (int i = 1; i < N; ++i) {
                char ch = str.charAt(i);
                if (ch == '0')
                    System.out.print("+");
                else {
                    if (sum == 1) {
                        System.out.print("-");
                        sum -= 1;
                    } else {
                        System.out.print("+");
                        sum += 1;
                    }
                }
            }
            System.out.println();
        }
    }
}
