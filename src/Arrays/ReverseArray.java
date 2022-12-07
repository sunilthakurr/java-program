package Arrays;


import java.util.HashSet;

public class ReverseArray {
    public static void main(String[] args) {

    }

    static long maxScore(int N, long[] nums) {
        // Write your code here
        long maxx = 0, mask = 0;
        int n = N;

        HashSet<Integer> se = new HashSet<Integer>();

        for (int i = 30; i >= 0; i--) {

            // set the i'th bit in mask
            // like 100000, 110000, 111000..
            mask |= (1 << i);

            for (int j = 0; j < n; ++j) {

                // Just keep the prefix till
                // i'th bit neglecting all
                // the bit's after i'th bit
                se.add((int) (nums[j] & mask));
            }

            long newMaxx = maxx | (1 << i);

            for (int prefix : se) {

                // find two pair in set
                // such that a^b = newMaxx
                // which is the highest
                // possible bit can be obtained
                if (se.contains(newMaxx ^ prefix)) {
                    maxx = newMaxx;
                    break;
                }
            }

            // clear the set for next
            // iteration
            se.clear();
        }
        return maxx;
    }
}





