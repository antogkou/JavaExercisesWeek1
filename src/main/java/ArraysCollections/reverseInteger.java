package ArraysCollections;

//2. Write a program that returns the digits of number in descending order
public class reverseInteger {


    public static void main (String[] args)
    {
        int num = 4562;
        System.out.println("Reverse of no. is "
                + reversDigits(num));
    }

    static int reversDigits(int num)
    {
        int rev_num = 0;
        while(num > 0)
        {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
}
