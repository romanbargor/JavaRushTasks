package com.javarush.task.pro.task06.task0607;

/* 
Добро пожаловать! Но не всем.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        signIn(console.nextLine());

    }

    public static void signIn(String username) {
        String name = "user";
        if (name.equals(username)) {
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);


        }
    }
}
