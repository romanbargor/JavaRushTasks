package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String omg = console.nextLine();
        String ruh = console.nextLine();

        System.out.println(ruh);
        System.out.println(omg.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}
