package com.javarush.task.pro.task04.task0425;

/* 
Диггер (1)
*/

public class Solution {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";


    public static void main(String[] args) {
        String repeated = land.repeat(3);
        String repeated2 = land.repeat(6);
        System.out.print(repeated);
        System.out.print(robot);
        System.out.print(repeated2);
        System.out.println();

        for (int i = 1; i <=8; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(land);
            }
            System.out.println();
        }
        for (int k = 0; k <= 9; k++) {
            System.out.print(bug);
        }
    }
}
