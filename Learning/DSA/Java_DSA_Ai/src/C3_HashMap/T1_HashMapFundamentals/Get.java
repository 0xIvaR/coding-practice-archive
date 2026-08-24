package C3_HashMap.T1_HashMapFundamentals;

import java.util.HashMap;

public class Get {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 50);
        map.put("Banana", 30);
        map.put("Mango", 80);

        System.out.println(map.keySet());

        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }
    }
}