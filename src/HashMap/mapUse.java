package HashMap;

import java.util.HashMap;

public class mapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insert
        map.put("abc", 1);
        map.put("def", 2);

        //check presence
        if (map.containsKey("abc")) {
            System.out.println("abc is present in map");
        }
        // get value
        int val = 0;
        if (map.containsKey("def"))
            val = map.get("def");
        System.out.println("def occurs " + val + " times");

        int s = map.remove("abc");
        System.out.println("we remove abc, which occurs " + s + " times");
    }
}
