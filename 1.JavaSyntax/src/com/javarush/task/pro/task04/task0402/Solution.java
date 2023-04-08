package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        Scanner console = new Scanner(System.in);
        String t = console.nextLine();
        String s = t + text;
        int q = 1;
        while (q <= 10) {
            System.out.println(s);
            q++;
        }

    }
}
