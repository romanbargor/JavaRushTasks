package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;

        Scanner console = new Scanner(System.in);
        boolean man = console.nextBoolean();
        if (man == true) {
            int result = (int) Math.ceil(glass);
            System.out.println(result);

        } else if (man == false) {
            int result2 = (int) Math.floor(glass);
            System.out.println(result2);


        }
    }
}