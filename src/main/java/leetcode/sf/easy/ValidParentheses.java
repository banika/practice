package leetcode.sf.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    Map<Character, Character> mappings = new HashMap<>();
    Stack<Character> stack = new Stack<>();

    public ValidParentheses() {
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public boolean isValid(String s) {
        for(int i =0;i<s.length();i++){
            if(mappings.containsKey(s.charAt(i))){
                Character topElement = stack.empty()?'#':stack.pop();
                if(mappings.get(s.charAt(i))!=topElement)
                    return false;
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
}
