package Arrays;

import java.util.Scanner;

public class TargetSumPair {
    public static void findPair(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (nums[i] < nums[j]) {
                        System.out.printf("%d and %d", nums[i], nums[j]);
                        System.out.println();
                    } else {
                        System.out.printf("%d and %d", nums[j], nums[i]);
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; ++i) {
            nums[i] = obj.nextInt();
        }
        int target = obj.nextInt();

        findPair(nums, target);
    }
}
