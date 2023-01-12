package CodeForces.GoodBye2022;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class KoxiaAndWhiteBoard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int N = obj.nextInt();
            int M = obj.nextInt();
            ArrayList<Integer> l1 = new ArrayList<>(N);
            for (int i = 0; i < N; ++i) {
                l1.add(obj.nextInt());
            }
            ArrayList<Integer> l2 = new ArrayList<>(M);
            for (int i = 0; i < M; ++i) {
                l2.add(obj.nextInt());
            }
            long res = 0;
            res += l2.get(M - 1);
            l2.remove(M - 1);

            for (int i = 0; i < M - 1; ++i) {
                l1.add(l2.get(i));
            }
            Collections.sort(l1);
            N -= 1;
            int size = l1.size() - 1;
            while (N-- > 0) {
                res += l1.get(size--);
            }
            System.out.println(res);

        }
    }
}
