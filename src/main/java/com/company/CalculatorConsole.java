package com.company;

import java.util.Scanner;

public class CalculatorConsole {

    public static void runOnConsole(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Hi! What's your name:");
        String name = input.nextLine();

        System.out.println("type numbers");

        x = input.nextInt();
        y = input.nextInt();


        System.out.println("add, subtract, multiple or divide?");
        input.nextLine();
        String addorsubt = input.nextLine();

        int result = 0;


        if (addorsubt.equals("add")) {
            System.out.println();
            result = x + y;
        }


        if (addorsubt.equals("subtract")) {
            System.out.println();
            result = x - y;
        }

        if (addorsubt.equals("multiple")) {
            System.out.println();
            result = x * y;
        }

        if (addorsubt.equals("divide")) {
            System.out.println();
            result = x/y;
        }

        System.out.println(name + ", your result is : " + result);
    }

    // write your code here
}

