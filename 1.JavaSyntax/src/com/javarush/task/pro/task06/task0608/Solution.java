package com.javarush.task.pro.task06.task0608;

/* 
Кубический калькулятор
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println(cube(console.nextLong()));

    }
    public static long cube (long c) {
        c = c * c * c;
        return c;
    }


}
