package CodeForces.EducationalRound140Div2;

import java.util.Arrays;
import java.util.Scanner;

public class BlockTowers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();

        while (T-- > 0) {
            int N = obj.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; ++i) {
                arr[i] = obj.nextInt();
            }
            int temp = arr[0];
            Arrays.sort(arr);
            int flag;
            for (int j = 1; j < N; ++j) {
                flag = arr[j] - temp;
                if (flag > 0) {
                    if (flag % 2 == 0)
                        temp += flag / 2;
                    else
                        temp += flag / 2 + 1;
                }
            }
            System.out.println(temp);
        }
    }
}
