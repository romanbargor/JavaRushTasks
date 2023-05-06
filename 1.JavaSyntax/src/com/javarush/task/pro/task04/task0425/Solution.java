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
        for (int a = 0; a <= 8; a++) {
            for (int b = 0; b <= 9; b++) {
                if (b == 3) {
                    System.out.print(hole);
                    continue;


                }


                System.out.print(land);


            }
            System.out.println();
        }

        for (int d = 0; d <= 9; d++)
            System.out.print(death);

    }
}




