package interview.coding;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(')
            	{stack.push(')');
            	System.out.println();
            	}
            	
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));        // Output: true
        System.out.println(isValid("()[]{}"));    // Output: true
        System.out.println(isValid("(]"));        // Output: false
        System.out.println(isValid("([])"));      // Output: true
    }
}
