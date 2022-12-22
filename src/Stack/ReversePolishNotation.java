package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of String array");
        int size = obj.nextInt();
        String[] arr = new String[size];
        System.out.println("Enter the elements of string array");

        for (int i = 0; i < size; ++i) {
            arr[i] = obj.next();
        }
        int result = evalRPN(arr);
        System.out.println("Result after solving given Reverse Polish is : " + result);
    }

    public static int evalRPN(String[] tokens) {
        // int a, int b;
        Stack<Integer> st = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> st.push(st.pop() + st.pop());
                case "-" -> st.push(-st.pop() + st.pop());
                case "*" -> st.push(st.pop() * st.pop());
                case "/" -> {
                    int temp = st.pop();
                    st.push(st.pop() / temp);
                }
                default -> st.push(Integer.parseInt(token));
            }
        }
        return st.pop();

    }
}
