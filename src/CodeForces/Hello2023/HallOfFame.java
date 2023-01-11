package CodeForces.Hello2023;

import java.util.Scanner;

public class HallOfFame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            String str = obj.next();
            int count = 0;
            for (int i = 0; i < str.length(); ++i) {
                if (str.charAt(i) == 'R')
                    ++count;
            }
            if (count == 0 || count == N) {
                System.out.println(-1);
                continue;
            }
            int out = 0;
            for (int i = 0; i < N - 1; ++i) {
                if (str.charAt(i) == 'L' && str.charAt(i + 1) == 'R') {
                    out = i + 1;
                    break;
                }
            }
            System.out.println(out);


        }
    }
}
