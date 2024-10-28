// package MockProgram;

import java.util.Stack;

public class BracketOrderChecker {
    public static void main(String[] args) {
        char[] s = { '{', '[', '(', ')', ']', '}' }; // return true
        // char[] s = { '{', '[', '(', '}', ']', ')' }; // return false
        System.out.println(checkOrder(s));
    }

    static boolean checkOrder(char[] s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s) {
            // Push opening brackets onto the stack
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            // Check for corresponding closing brackets
            else if (ch == '}' || ch == ']' || ch == ')') {
                // If stack is empty or top of stack does not match, order is incorrect
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == '}' && top != '{') ||
                        (ch == ']' && top != '[') ||
                        (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        // If stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }
}
