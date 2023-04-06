package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.println(a.equalsIgnoreCase(secret) ? "доступ разрешен" : "доступ запрещен");

         //   System.out.println("доступ разрешен");
      //  } else {
         //   System.out.println("доступ запрещен");
        }
    }
