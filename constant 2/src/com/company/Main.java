package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println(23 % 8);{
//
//            if((100 % 5) == 0) {
//                System.out.println("Number is divisable by 5");
//            }
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number;
        number = input.nextInt();

        {
            if ((number % 2) == 0)
            System.out.println("Your number is even");
            else
                System.out.println("Your number is odd");


        }






    }
}
