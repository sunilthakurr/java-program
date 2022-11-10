package Arrays;

//In this question we put all unique elements in front of array and then simply count no. of unique elements

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FindUnique {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] arr = new int[N];
//        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> q = new Stack<>();
        int j = 0;
        for (int i = 0; i < N; ++i) {
            arr[i] = obj.nextInt();
        }
        q.push(arr[0]);
        int count = 1;
        for (int i = 0; i < arr.length; ++i) {
            if (q.peek() != arr[i]) {
                q.push(arr[i]);
                ++count;
            }

        }
        for (int i = count - 1; i >= 0; --i) {
            arr[i] = q.pop();
        }
        System.out.println(Arrays.toString(arr));

    }
}
