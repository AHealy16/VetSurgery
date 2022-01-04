package com.company;
import java.util.Scanner;
public class Main {

    public static int getUserInput(){

        try {
            Scanner input = new Scanner(System.in);
            int userInput = input.nextInt();
            return userInput;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return -1;

    }


    public static void main(String[] args) {




    }
}
