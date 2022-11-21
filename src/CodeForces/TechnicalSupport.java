package CodeForces;

import java.util.Scanner;

public class TechnicalSupport {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int len = obj.nextInt();
            String str = obj.next();
            int Qcount = 0;
            for (int j = 0; j < len; ++j) {
                if (str.charAt(j) == 'Q')
                    ++Qcount;
                else
                    --Qcount;
                if (Qcount < 0)
                    Qcount = 0;
            }
            if (Qcount == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}
