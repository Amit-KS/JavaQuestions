package com.learn.topics.Java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Add_Number_To_ValueOf_HashMap {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("z", 10);
        map.put("a", 30);
        map.put("c", 40);
        map.put("e", 5);
        map.put("t", 9);

        System.out.println("Adding number to Value of HashMap :");
        LinkedHashMap lMap= map.keySet().stream()
                .collect(Collectors.toMap(k->k , k->map.get(k)+100, (x, y)->x, LinkedHashMap::new));

        System.out.println(lMap);
    }
}
