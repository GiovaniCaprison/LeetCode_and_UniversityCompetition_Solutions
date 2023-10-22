package LeetCode_Easy_Problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class Valid_Parentheses {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch(c) {

                case '(':
                    stack.push(')');
                    break;

                case '{':
                    stack.push('}');
                    break;

                case '[':
                    stack.push(']');
                    break;

                case ')':
                case '}':
                case ']':
                    if (stack.isEmpty() || stack.pop() != c) return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
