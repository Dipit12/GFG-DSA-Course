package Stack;

import java.util.Scanner;
import java.util.Stack;

public class evaluation_of_prefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next(); // e.g., "23*54*+9-"
        Stack<Integer> st = new Stack<>();

        for(int i = s.length()-1; i >= 0;i--){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch - '0');
            }else{
                int op1 = st.pop();
                int op2 = st.pop();
                int result = 0;
               switch(ch){
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
