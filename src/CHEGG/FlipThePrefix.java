package CHEGG;

import java.util.Scanner;

public class FlipThePrefix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        while (T-- > 0) {
            int first = obj.nextInt();
            int second = obj.nextInt();
            String str = obj.next();
            helper(first, second, str);
        }
    }

    public static void helper(int first, int second, String str) {
        int temp = 0;
        int endResult = Integer.MAX_VALUE;
        int[] nums = new int[first];

        for (int i = 1; i < first; ++i) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                ++temp;
                nums[i] = temp;
            } else {
                nums[i] = temp;
            }
            nums[0] = 0;
        }
        for (int i = first - 1; i >= 0; --i) {
            if ((i - (second - 1)) < 0)
                break;
            int police = nums[i] - nums[i - second + 1];
            if (str.charAt(i) == '0')
                ++police;
            endResult = Math.min(endResult, police);
        }
        System.out.println(endResult);
    }
}


