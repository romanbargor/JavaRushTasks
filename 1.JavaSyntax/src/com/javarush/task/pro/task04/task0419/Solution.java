package com.javarush.task.pro.task04.task0419;

import java.util.Scanner;

/* 
Защита от землетрясения
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int x = 0;

        if (number > 0){
            while (x <= number){
                sum = sum + x;
                x++;
            }
        }


        System.out.println(sum);
    }
}