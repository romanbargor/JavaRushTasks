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
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <=9; j++) {
                System.out.print(land);
            }
            System.out.println();
        }
    }
}
