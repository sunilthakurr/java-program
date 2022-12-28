package CodeForces.Round841AndDivideByZero;

import java.util.Scanner;

public class KillDemoDogs {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int modulo = 1000000007;
        long result = 0;
        for (int i = 0; i < T; ++i) {
            long n = obj.nextLong();
            result = ((((n * (n + 1)) % modulo) * ((4 * n - 1) % modulo)) % modulo * 337) % modulo;
            System.out.println(result);
            result = 0;
        }
    }
}
