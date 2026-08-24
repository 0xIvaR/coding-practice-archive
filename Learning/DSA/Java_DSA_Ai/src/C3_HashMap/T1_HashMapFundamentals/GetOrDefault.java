package C3_HashMap.T1_HashMapFundamentals;

import java.util.HashMap;

public class GetOrDefault {
    public static void main(String[] args) {

        int[] nums = {2, 3, 2, 5, 3, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Your code here
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("=================");

        for (int key1 : map.keySet()) {
            System.out.println(key1);
        }

        System.out.println("=================");

        for (int key2 : map.values()) {
            System.out.println(key2);
        }

    }
}