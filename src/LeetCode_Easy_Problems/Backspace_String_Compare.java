package LeetCode_Easy_Problems;

import java.util.Stack;

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                stackS.push(c);
                continue;
            }
            if(!stackS.isEmpty()) stackS.pop();
        }
        for(char c : t.toCharArray()) {
            if(Character.isLetter(c)) {
                stackT.push(c);
                continue;
            }
            if(!stackT.isEmpty())stackT.pop();
        }

        if(stackS.size() != stackT.size()) return false;
        int n = stackS.size();
        for(int i = 0; i < n; i++) {
            char c = stackS.pop();
            char d = stackT.pop();
            if(c != d) return false;
        }

        return true;
    }
}

