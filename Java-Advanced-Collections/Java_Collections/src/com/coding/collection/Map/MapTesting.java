package com.coding.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTesting {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sushil", 100);
        map.put("Nikhil", 89);
        map.put("Jaswant", 88);

        System.out.println(map.size());
        System.out.println("Sushil score : " + map.get("Sushil"));
        System.out.println("Yathin in map : " + map.containsKey("Yathin"));

        System.out.println("Keys : ");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

    }
}
