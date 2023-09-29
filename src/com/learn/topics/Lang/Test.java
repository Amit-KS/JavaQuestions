package com.learn.topics.Lang;

public class Test {
    public static void main(String[] args) {
        String s1= "Amit";
        String s2= "Amit";

        String s3= new String("Amit");
        String s4= new String("Amit");


        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s4));
    }

}
