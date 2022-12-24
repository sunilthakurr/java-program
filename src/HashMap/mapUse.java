package HashMap;

import java.util.HashMap;
import java.util.Set;

public class mapUse {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Inserting key value pair in hashmap
        map.put("abc", 1);
        map.put("def", 2);

        // check whether hashmap contains key
        System.out.println(map.containsKey("abc"));         // returns true
        System.out.println(map.containsKey("abc1"));        // return false

        // get value of particular key
        int v;
        if (map.containsKey("abc")) {
            v = map.get("abc");
            System.out.println(v);
        }

        // Remove the key from hashmap
        int s = map.remove("abc");             // remove the key and return its value
        System.out.println(s);

        // check whether hashmap contains value
        System.out.println(map.containsValue(2));         // return true   (very expensive : O(n)  )

        map.put("abc", 5);                          // just update the value of key "abc" don't increase the size of map

        // size of Hashmap
        int size = map.size();
        System.out.println("size of hashmap : " + size);                       // returns the size of hashmap

        // iterate over hashmap
        Set<String> keys = map.keySet();               // return all the keys and store in set
        for (String str : keys) {                        // display all the keys of hashmap
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println(map);
    }
    }

