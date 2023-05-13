package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int meters = console.nextInt();
        double item = meters * 3.6;
        long kilometers = Math.round(item);


        System.out.println(kilometers);



    }
}