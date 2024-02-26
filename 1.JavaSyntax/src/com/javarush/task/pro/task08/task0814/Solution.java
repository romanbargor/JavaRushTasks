package com.javarush.task.pro.task08.task0814;

/* 
Флаги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(setFlag(5,1));
        System.out.println(resetFlag(7,1));
        System.out.println(checkFlag(14,2));
    }

    public static int setFlag(int number, int flagPos) {
       return number | (1<< flagPos);

    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 <<flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1<< flagPos)) == (1 << flagPos);

    }
}
