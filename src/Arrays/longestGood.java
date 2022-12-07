package Arrays;

public class longestGood {
    static int longestVowel(String str) {
        int count = 0, res = 0;
        char[] s = str.toCharArray();

        for (int i = 0; i < s.length; i++) {

            // Increment current count
            // if s[i] is vowel
            if (isVowel(s[i]))
                count++;

            else {
                // check previous value
                // is greater then or not
                res = Math.max(res, count);

                count = 0;
            }
        }

        return Math.max(res, count);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}
