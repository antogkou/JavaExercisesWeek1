public class calculateMaxValueInt {

    public static void main(String[] args)
    {
        System.out.println("Maximum value of"+
                " integer " +
                findMaxValue());
    }

    public static int findMaxValue()
    {
        int res = 2;
        long fact = 2;
        while (fact >= 0) {
            res++;
            fact = fact * res;
        }
        return res - 1;
    }
}
