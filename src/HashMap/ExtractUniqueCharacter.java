package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ExtractUniqueCharacter {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        System.out.println(UniqueCharacter(str));
    }

    public static String UniqueCharacter(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
                st.append(str.charAt(i));
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        return st.toString();
    }
}
