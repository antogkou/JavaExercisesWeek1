package Algorithms;//6. Given a positive float number, print its decimal part. For example, given the number 2.31, the output should be 0.31.

public class floatDecimalPart {

    public static void main(String[] args) {

        float number = (float) 2.34454;
        String floatAsString = String.valueOf(number);
        int indexOfFloat = floatAsString.indexOf(".");
        if (number >= 0){
            System.out.println("Float Number: " + number);
            System.out.println("Integer Part: " + floatAsString.substring(0, indexOfFloat));
            System.out.println("Decimal Part: 0" + floatAsString.substring(indexOfFloat));

        }
    }
}
