package String;


//We define the usage of capitals in a word to be right when one of the following cases holds:
//
//        All letters in this word are capitals, like "USA".
//        All letters in this word are not capitals, like "leetcode".
//        Only the first letter in this word is capital, like "Google".
//        Given a string word, return true if the usage of capitals in it is right.
//
//
//
//        Example 1:
//
//        Input: word = "USA"
//        Output: true
//        Example 2:
//
//        Input: word = "FlaG"
//        Output: false
//
//
//        Constraints:
//
//        1 <= word.length <= 100
//        word consists of lowercase and uppercase English letters.


import java.util.Scanner;

public class DetectCapital {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        int len = str.length();
        if (len <= 1)
            return true;
        boolean fchar = isSmall(str.charAt(0));
        if (fchar) {
            for (int i = 1; i < len; ++i) {
                if (!isSmall(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            boolean schar = isSmall(str.charAt(1));
            if (!schar) {
                for (int i = 2; i < len; ++i) {
                    if (!isCapital(str.charAt(i)))
                        return false;
                }

                return true;
            } else {
                for (int i = 2; i < len; ++i) {
                    if (!isSmall(str.charAt(i)))
                        return false;
                }
                return true;
            }
        }
    }

    public static boolean isSmall(char ch) {
        if (ch >= 97 && ch <= 122)
            return true;
        return false;
    }

    public static boolean isCapital(char ch) {
        if (ch >= 65 && ch <= 90)
            return true;
        return false;
    }
}
