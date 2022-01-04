package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the price");
    double amount = input.nextDouble();
    double VAT = 0.2*amount;
    double total = amount+VAT;
    System.out.println(total);
    System.out.println("Do you want to calculate another amount? If so enter Y if not enter N");
    String repeat = input.next();
    if repeat = "Y"{
            System.out.println("Please enter the price");
            amount = input.nextDouble();
            VAT = 0.2*amount;
            total = amount+VAT;
            System.out.println(total);
            System.out.println("Do you want to calculate another amount? If so enter Y if not enter N");

        }

    }
}
