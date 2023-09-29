package com.learn.topics.Collections;

import com.learn.topics.Java8.utility.Employee;

import java.util.HashMap;
import java.util.Map;

public class QuestionsOnHashmap {
    public static void main(String[] args) {
      final  Map<Employee, Integer> hashmap = new HashMap<Employee, Integer>();

        Employee e1= new Employee(1,"A",100);
        Employee e2= new Employee(1,"A", 100);

        hashmap.put(e1,1);
        hashmap.put(e1,2);
        hashmap.put(e2,3);


        System.out.println(".equals operator:"+e1.equals(e2));
        System.out.println(e1==e2);
        System.out.println("Hashmap size: "+hashmap.size());
    }
}
