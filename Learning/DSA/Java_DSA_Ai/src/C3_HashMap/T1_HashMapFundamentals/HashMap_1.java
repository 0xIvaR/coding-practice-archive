package C3_HashMap.T1_HashMapFundamentals;

import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Soham");
        map.put(102, "Rahul");
        map.put(103, "Priya");

        System.out.println(map.get(102));

        System.out.println(map.containsKey(103));

        map.remove(101);

        System.out.println(map.size());
    }
}