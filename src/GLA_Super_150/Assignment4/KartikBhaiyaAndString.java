package GLA_Super_150.Assignment4;

import java.util.Scanner;

public class KartikBhaiyaAndString {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int k = obj.nextInt();
        String str = obj.next();
        int max1 = maxSubArray(str, k, 'a');
        int max2 = maxSubArray(str, k, 'b');
        System.out.println(Math.max(max1, max2));

    }

    public static int maxSubArray(String str, int k, int ch) {
        int si = 0;
        int ei = 0;
        int flip = 0;
        int ans = 0;
        while (ei < str.length()) {
            // window growing
            if (str.charAt(ei) == ch) {
                ++flip;
            }
            // window decreasing
            while (flip > k) {
                if (str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }
            // calculating window size
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
