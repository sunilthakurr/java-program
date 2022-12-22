package Arrays;

// Java program to evaluate all possible
// values of a expression

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class MonuBhaiaPuzzle {
    public static int eval(int a, char op, int b) {
        if (op == '+') {
            return a + b;
        }
        if (op == '-') {
            return a - b;
        }
        if (op == '*') {
            return a * b;
        }
        return Integer.MAX_VALUE;
    }

    static Vector<Integer> evaluateAll(String expr,
                                       int low, int high) {
        Vector<Integer> res = new Vector<Integer>();

        if (low == high) {
            res.add(expr.charAt(low) - '0');
            return res;
        }
        if (low == (high - 2)) {
            int num = eval(expr.charAt(low) - '0',
                    expr.charAt(low + 1),
                    expr.charAt(low + 2) - '0');

            res.add(num);
            return res;
        }
        for (int i = low + 1; i <= high; i += 2) {
            Vector<Integer> l = evaluateAll(expr, low, i - 1);
            Vector<Integer> r = evaluateAll(expr, i + 1, high);


            for (int s1 = 0; s1 < l.size(); s1++) {


                for (int s2 = 0; s2 < r.size(); s2++) {

                    // Calculate value for every pair
                    // and add the value to result.
                    int val = eval(l.get(s1), expr.charAt(i), r.get(s2));
                    res.add(val);
                }
            }
        }
        return res;
    }

    // Driver program
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String expr = obj.next();
        int len = expr.length();
        Vector<Integer> ans = evaluateAll(expr, 0, len - 1);
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < ans.size(); ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}


