package com.javarush.task.pro.task06.task0609;

/* 
Кубический калькулятор в кубе
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(cube(2) * cube(2) * cube(2));
        System.out.println(ninthDegree(2));

    }

    public static long cube(long a){return a*a*a;
    }

    public static long ninthDegree(long a) {
        long b = cube(a);
        return cube(b);
    }


}