package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class ChallengingValleys {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int temp = 0;

        while (T-- > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int N = obj.nextInt();
            for (int i = 0; i < N; ++i) {
                temp = obj.nextInt();
                if (i == 0 || list.get(list.size() - 1) != temp) {
                    list.add(list.size(), temp);
                }
            }
            int flag = 0;
            for (int i = 0; i < list.size(); ++i) {
                if ((i == 0 || list.get(i - 1) > list.get(i)) && (i == list.size() - 1 || list.get(i) < list.get(i + 1))) {

                    ++flag;
                    break;
                }
            }
            System.out.println(flag);
            if (flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");

//            System.out.println(list.toString());
        }
    }
}
