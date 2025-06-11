package Stack;

import java.util.Scanner;
import java.util.Stack;

public class evaluation_of_postfix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next(); // e.g., "23*54*+9-"
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character is a digit
            if(Character.isDigit(ch)) {
                st.push(ch - '0'); // Convert char digit to int
            } else {
                int op2 = st.pop(); // Second operand
                int op1 = st.pop(); // First operand
                int result = 0;

                switch(ch) {
                    case '+': result = op1 + op2; break;
                    case '-': result = op1 - op2; break;
                    case '*': result = op1 * op2; break;
                    case '/': result = op1 / op2; break;
                    default:
                        System.out.println("Invalid operator: " + ch);
                        return;
                }

                st.push(result);
            }
        }

        System.out.println("Result: " + st.peek());
    }
}
