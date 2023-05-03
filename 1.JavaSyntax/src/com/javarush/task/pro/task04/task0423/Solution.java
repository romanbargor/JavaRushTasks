package com.javarush.task.pro.task04.task0423;

import java.util.Scanner;

/* 
Калибровка климата
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                sum+=b;
            }

        }
        System.out.println(sum / 5);
    }
}
