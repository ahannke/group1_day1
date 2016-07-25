package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;



        System.out.println("Hi! What's your name:");
        String name = input.nextLine();

        System.out.println("type numbers");

        x=input.nextInt();
        y=input.nextInt();


        int result = x+y;



        System.out.println(name + ", your result is : " +result );
        // write your code here
    }
}
