package Algorithms;

import java.util.Scanner;
//1. Write a program that calculates the factorial of a number n

public class calculateFactorial {
    public static void calculateFactorials(){

        int i, factorialNumber = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number: ");
        int number = Integer.parseInt(scanner.nextLine());

        for (i=1; i <= number; i++){
            factorialNumber = factorialNumber * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorialNumber);
    }
}

