// package MockProgram;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {

        // String s = "{[()]}";
        // String s = "{}[]()";
        // String s = "{}{";
        String s = "}";
        // String s = ")()";

        Stack<Character> st = new Stack<Character>();
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.size() > 0) {
                    char pc = st.pop();

                    if (pc == '(' && c == ')' || pc == '[' && c == ']' || pc == '{' && c == '}') {
                        flag = true;
                    } else {
                        // flag = false;
                        System.out.println("invalid");
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (st.isEmpty() && flag != false)
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}
