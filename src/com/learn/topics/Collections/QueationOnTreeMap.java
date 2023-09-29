package com.learn.topics.Collections;

import com.learn.topics.Java8.utility.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class QueationOnTreeMap {

    public static void main(String[] args) {
        final Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>();

        Employee e1= new Employee(1,"A",100);
        Employee e2= new Employee(2,"A", 100);

        treeMap.put(e1,1);
        treeMap.put(e1,2);

        System.out.println(treeMap);
    }
}
