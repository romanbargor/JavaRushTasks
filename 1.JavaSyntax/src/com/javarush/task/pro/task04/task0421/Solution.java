package com.javarush.task.pro.task04.task0421;

/* 
Охлаждение ядра планеты
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
          if ((i % 2) == 0) {
             sum = sum + i;
          }
          i++;

        }
        System.out.println(sum);




        }

        }