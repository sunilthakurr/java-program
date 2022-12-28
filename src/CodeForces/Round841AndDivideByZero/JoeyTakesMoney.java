package CodeForces.Round841AndDivideByZero;

import java.util.Scanner;

public class JoeyTakesMoney {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int size = obj.nextInt();
            long result = 1;
            int[] arr = new int[size];
            for (int i = 0; i < size; ++i) {
                arr[i] = obj.nextInt();
                result *= arr[i];
            }
            result += (size - 1);
            System.out.println(result * 2022);
        }
    }
}
