package GLA_Super_150.Assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSlidingWindows {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int window_size = sc.nextInt();

        while (true) {
            int ele = sc.nextInt();
            if (ele == -1)
                break;
            list.add(ele);
        }

        double sum = 0;
        int j = 0;     // to shrink the element from starting position.
        for (int i = 0; i < list.size(); i++) {
            if (i < window_size) {
                sum += list.get(i);
                System.out.printf("%.4f ", sum / (i + 1));
            } else {
                sum += list.get(i) - list.get(j);
                System.out.printf("%.4f ", sum / (window_size));
                j++;
            }
        }
    }
}
