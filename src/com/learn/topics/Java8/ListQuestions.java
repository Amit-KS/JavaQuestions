package com.learn.topics.Java8;

import com.learn.topics.Java8.utility.Employee;

import java.util.*;

public class ListQuestions {


    public static void main(String[] args) {

        List<Employee> ls = new ArrayList<Employee>();
        Map<Employee, Integer> tmap = new TreeMap<>();
        HashMap<Employee, Integer> hm= new HashMap<Employee, Integer>();
        Employee e1= new Employee(1, "CRIC", 100);
        Employee e2= new Employee(2, "FIFA", 200);
        Employee e3= new Employee(3, "KHOKHO", 300);
        Employee e4= new Employee(4, "KABADI", 400);
        Employee e5= new Employee(5, "LUDO", 500);
        Employee e6= new Employee(6, "CHESS", 700);

        ls.add(e1);
        ls.add(e2);
        ls.add(e3);
        ls.add(e4);
        ls.add(e5);
        ls.add(e6);

        tmap.put(e1,1);
        tmap.put(e1,3);

        hm.put(e1,1);
        hm.put(e1,3);
        long tMapCount=  tmap.entrySet().stream().count();
        long MapCount=  hm.entrySet().stream().count();
        System.out.println("TreeMap size "+tMapCount);
        System.out.println("HashMap size "+MapCount);
        tmap.entrySet().stream().forEach(System.out::println);



        Employee maxSalary= ls.stream().sorted(Comparator.comparingDouble(Employee :: getSalary).reversed())
                .findFirst().get();

        Employee secMaxSalary= ls.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).skip(1).findFirst().get();

        System.out.println("Employee with max salary"+maxSalary);
        System.out.println("Employee with 2nd max salary"+secMaxSalary);


        //Q1 Given a list of integers, find out all the even numbers exist in the list using Stream functions?
        List<Integer> l1 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17);
        // l1.stream().filter(x-> x%2==0).forEach(System.out::println);

        //Stream.of(prices).boxed().reduce((x,y)->Integer.Max(y-x)).

        //Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> l2 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17);
        //l1.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);

        //Q3 How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> l3 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        Set<Integer> set = new HashSet<>();
        // l3.stream().filter(n->!set.add(n)).forEach(System.out::println);

        //Q4 Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> l4 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        l4.stream().findFirst().ifPresent(System.out::println);

        //Find the last element of a Stream in Java
        List<Integer> l8 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        //Integer x= l8.stream().sorted(Collections.reverseOrder()).findFirst().orElse(null);
        Integer x = l8.stream().skip(l8.size() - 1).findFirst().orElse(null);
        // System.out.println(x);


        //Q5 Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> l5 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        long xy = l5.stream().count();
        System.out.println(xy);

        //Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> l6 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        int xx = l6.stream().max(Integer::compare).get();

        //Count occurrence of a given character in a string using Stream API in Java
        String str = "geeksforgeeks";
        int count = (int) str.codePoints().filter(c -> c == 'k').count();
        System.out.println(count);

        //How to find duplicate elements in a Stream in Java
        List<Integer> l7 = Arrays.asList(10, 33, 22, 19, 2, 8, 14, 17, 22, 17);
        // Set<Integer> s= new HashSet<Integer>();
        //set.add() method returns false if element is already present in the set
        // Set<Integer> x= l7.stream().filter(n-> !s.add(n)).collect(Collectors.toSet());
        // System.out.println(x);
        //Set<Integer> duplicate = l7.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
        //  .stream().filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());
        //System.out.println(duplicate);

        //second heighest salary
        String s1= "loveleetcode";

        int[] countt = new int[128];
        for (final char c : s1.toCharArray())
            System.out.println(c +" "+ ++countt[c]);


        Arrays.stream(countt).boxed().forEach(System.out::print);







    }
}
