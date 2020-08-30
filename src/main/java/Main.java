import Algorithms.*;
import ArraysCollections.reverseString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose an exercise level to run: ");
        System.out.println("1. Calculate the factorial of a number n " + "\n" +
                "2. Find the maximum value of n as int so that the calculated output is valid\n" +
                "3. True or false depending on if the number is prime or not \n" +
                "4. For a given n, it calculates the following value: 1 + ½ + ⅓ + … + 1/n\n" +
                "5. Count the digits of a long number. \n" +
                "6. Given a positive float number, print its decimal part.\n"
        );
        int userChoice = 0;

       do{
          userChoice = userInput.nextInt();
           switch(userChoice) {
               case 1:
                   System.out.println("You chose 1");
                   calculateFactorial.calculateFactorials();
                   break;
               case 2:
                   System.out.println("You chose 2");
                   calculateMaxValueInt.main();
                   break;
               case 3:
                   System.out.println("You chose 3");
                   primeCheck.main();
                   break;
               case 4:
                   System.out.println("You chose 4");
                   calculateValue1n.main();
                   break;
               case 5:
                   System.out.println("You chose 5");
                   DigitNumbersLong.main();
                   break;
               case 6:
                   System.out.println("You chose 6");
                   floatDecimalPart.main();
                   break;
               default:
                   System.out.println("Invalid Option, Program will now stop");
           }
       }while(userChoice > 0 && userChoice < 7);

    }
}
