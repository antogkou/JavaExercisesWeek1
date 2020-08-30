package ArraysCollections;

import java.util.Stack;

public class reverseString {
    public static void reverseStrings(String str) {
        char[] charArr = str.toCharArray();
        int size = charArr.length;
        Stack<Character> stack = new Stack<Character>();

        int i;
        for(i = 0; i < size; ++i) {
            stack.push(charArr[i]);
        }

        for(i = 0; i < size; ++i) {
            charArr[i] = stack.pop();
        }
        System.out.print(str + " = ");
        System.out.print(charArr);
    }
}
