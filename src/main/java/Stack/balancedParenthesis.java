package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedParenthesis {

    static boolean matching(char ch, char x) {
        return ((ch == '(' && x == ')') || (ch == '{' && x == '}') || (ch == '[' && x == ']'));
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        Scanner input = new Scanner(System.in);
        String str = input.next();
        input.close();  // Good practice

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty() || !matching(s.pop(), ch)) {
                    System.out.println(false);
                    return;  // Exit early
                }
            }
        }

        // Final check
        if (s.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}