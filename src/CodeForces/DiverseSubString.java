package CodeForces;

import java.util.HashSet;
import java.util.Scanner;

public class DiverseSubString {
    static final int ASCII_SIZE = 256;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int len = obj.nextInt();
            String str = obj.next();
            System.out.println(validSubStringCounter(str));
        }
    }

    public static int validSubStringCounter(String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (isValid(temp))
                    ++flag;
            }
        }
        return flag;
    }

    public static boolean isValid(String str) {
        int count = 0;
        char ch = getMaxOccurringChar(str);
        int unique = cntDistinct(str);
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ch)
                ++count;
        }
        if (unique >= count)
            return true;
        return false;
    }

    static char getMaxOccurringChar(String str) {

        int count[] = new int[ASCII_SIZE];


        int len = str.length();
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize result


        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }

        return result;
    }

    static int cntDistinct(String str) {


        HashSet<Character> s = new HashSet<Character>();


        for (int i = 0; i < str.length(); i++) {


            s.add(str.charAt(i));
        }


        return s.size();
    }
}
