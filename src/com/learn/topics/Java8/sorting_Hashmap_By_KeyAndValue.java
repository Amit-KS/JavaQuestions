package com.learn.topics.Java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;

public class sorting_Hashmap_By_KeyAndValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap< >();
        map.put("z", 10);
        map.put("a", 30);
        map.put("c", 40);
        map.put("e", 5);
        map.put("t", 9);

        Stack<Character> stack= new Stack<>();
        stack.isEmpty();

        System.out.println("Sorting By Key :");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("Sorting By Value :");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("Sorting and collecting in LinkedHashMap :");
        LinkedHashMap lMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry:: getValue,(x, y)->x, LinkedHashMap::new));
        System.out.println(lMap);

        /*final Map<String , Integer> map= new HashMap<>();
        map.put("Amit", 1);
        System.out.println(map.put("Amit", 2));


        System.out.println("Map Size:"+ map.size()+ ", "+map.get("Amit"));

        String s = new String("Amit");
        map.put(s, 3);

        System.out.println("Map Size:"+ map.size()+ ", "+map.get(s));

        System.out.println("map size"+ map.size());*/



    }

}
