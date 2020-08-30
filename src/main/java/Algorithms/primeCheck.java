package Algorithms;

import java.util.Scanner;

public class primeCheck {
    int number = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number, i, a = 0;

        System.out.println("Enter a number: ");
        number = in.nextInt();

        for (i = 1; i < (number + 1); i++) {
            if (number % i == 0) {
                a++;
            }
        }

        System.out.println(prime(a));
    }

    public static boolean prime(int a) {
        return a == 2;
    }

}

