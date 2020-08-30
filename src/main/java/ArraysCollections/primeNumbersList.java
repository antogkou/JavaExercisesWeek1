package ArraysCollections;

import java.util.ArrayList;

// 1.Given a list of integers, return a sub list that contains only the prime numbers
public class primeNumbersList {
    public static void calcPrimeArray(ArrayList<Integer> integerArrayList) {

        integerArrayList.removeIf(n -> (n % 2 != 0));
        System.out.print("Prime numbers: " + integerArrayList.toString());

    }
}
