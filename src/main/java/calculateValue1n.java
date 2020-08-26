//4. Write a program that, for a given n, it calculates the following value: 1 + ½ + ⅓ + … + 1/n.
public class calculateValue1n {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    static double sum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1.0 / factorial(i);
        return sum;
    }
}
