package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
//        ArrayList<Integer> list = new ArrayList<>();
        // your code goes here
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int A = obj.nextInt();
            int B = obj.nextInt();
//            ArrayList<Integer> list1 = new ArrayList<>();
//            list1 = primeFactors(B);
//            int count = 0;
//            for(int j = 0; j < list1.size(); ++j){
//                if(A % list1.get(j) != 0)
//                    ++count;
//            }
            int count = primeFactors(B, A);
            if (count == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static int primeFactors(int n, int A) {
        ArrayList<Integer> list = new ArrayList<>();
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
//                // System.out.print(c + " ");
//                list.add(c);
                if (A % c != 0)
                    return 0;
                n /= c;
            } else
                c++;
        }
//        for(int i = 0; i < )
        return 1;
    }
}
