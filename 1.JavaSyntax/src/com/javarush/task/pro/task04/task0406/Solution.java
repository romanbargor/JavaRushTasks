package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (console.hasNextLine()) {
            String s = console.nextLine();
            if (s.equals("enough"))
                break;
            System.out.println(s);

        }

    }
}