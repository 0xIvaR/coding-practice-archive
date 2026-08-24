package C3_HashMap.T1_HashMapFundamentals;

import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Mango", 80);

        //System.out.println(map.getOrDefault("Apple", 0));
        map.put("Apple", map.getOrDefault("Apple", 0) + 1);

        // 2. Print the price of "Mango"
        System.out.println("Price of Apple: " + map.get("Apple"));

        // 3. Check whether "Apple" exists
        System.out.println("Does Apple exist? " + map.containsKey("Apple"));

        // 4. Change "Banana"'s price to 30
        map.put("Banana", 30);

        // 5. Remove "Apple"
        map.remove("Apple");

        // 6. Print the final size
        System.out.println("Final size of HashMap: " + map.size());
    }
}
