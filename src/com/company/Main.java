package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int result = 2*2;

        System.out.println("Hi! What's your name:");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();


        System.out.println(name + ", your result is : " +result );
        // write your code here
    }
}
