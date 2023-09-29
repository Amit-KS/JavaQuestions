package com.learn.topics.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Counting_EachChar_In_String {

    public static void main(String[] args) {
        String s = "I am Amit Sharma";

        System.out.println("Before Java 8:");
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (!String.valueOf(c).isBlank()) {
            /*if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
            */
                //Better way to check if the map contains that key or no
                map.computeIfPresent(c, (k, v) -> v + 1);
                map.computeIfAbsent(c, v -> 1);
            }
        }
        System.out.println(map);

        System.out.println("After Java 8:");
        Map<String, Long> mapy = s.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        s.codePoints().mapToObj(Character::toString).forEach(System.out::println);

        System.out.println("codepoints:" + mapy);

        Map<String, Long> mapz = Arrays.stream(s.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("split" + mapz);

        //duplicate elements

        s.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(k -> k.getValue() > 1).map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //find first non repeating element for string
        //Linkedhash map to preserve the order
        String fd = s.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(k -> k.getValue() == 1).findFirst().get().getKey();
        System.out.println("first duplicate: " + fd);

        //find second height value for array
        int[] arr = {5, 9, 11, 2, 8, 21, 1};
        int val = 10;
        int d = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        //wrong :  int z= Arrays.stream(arr).boxed().max(Integer::compare).stream().skip(1).findFirst().get();
        System.out.println(d);
        int x = Arrays.stream(arr).filter(z -> z != val).toArray().length;

        int max = Arrays.stream(arr).boxed().max(Comparator.comparing(Integer::valueOf)).get();
        int min = Arrays.stream(arr).boxed().min((Comparator.comparing(Integer::valueOf))).get();
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);


        //find longest sting from a given array.
        String[] strArray = {"aaa", "aababa", "cc", "fff", "tttt"};
        String longestString = Arrays.stream(strArray)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);


        //String Join method
        List<String> pattern = Arrays.asList("1", "2", "3", "4");
        String results = String.join("-", pattern);
        System.out.println(results);

        //skip and limit method based use case
        //print 2 to 9
        IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);

        //sort list and map
        //map and flat map


        String s1 = "Amit";
        String s2 = new String("Amit");

        String strs = "a good       example";
        String[] st = strs.split(" ");
        for (String t : st) {
            System.out.print(t);
        }
    }
}
