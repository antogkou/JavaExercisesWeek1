package ArraysCollections;

public class checkSymmetric {

    public static void checkIfSymmetric(String myText) {
        String cleanString = myText.replaceAll("\\s+", "").toLowerCase();
        int length = cleanString.length();
        int forward = 0;
        int backward = length - 1;
        char forwardChar = 0;
        char backwardChar = 0;

        while (backward > forward) {
            forwardChar = cleanString.charAt(forward++);
            backwardChar = cleanString.charAt(backward--);
        }

        if (forwardChar != backwardChar)
            System.out.println(myText + " is not symmetric");
        else
            System.out.println(myText + " is symmetric");
    }

}
