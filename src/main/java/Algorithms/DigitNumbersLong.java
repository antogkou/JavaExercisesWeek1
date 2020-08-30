package Algorithms;

import java.util.Scanner;

public class DigitNumbersLong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a number to calculate the number of digits: ");
        long num = Long.parseLong(scanner.nextLine());

        long count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }

        System.out.println("Number of long digits: " + count);
    }
}
