public class Main {
    public static void main(String args[]){
        int i, factorialNumber = 1;
        int number = 4;
        for (i=1; i <= number; i++){
            factorialNumber = factorialNumber * i;
        }
        System.out.println("The factorial of " + number + " is: " + factorialNumber);
    }
}

