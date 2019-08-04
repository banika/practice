package leetcode.sf.hard;

import java.util.Stack;

// https://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(!stack.empty())
                    result = Math.max(result, i-stack.peek());
                else
                    stack.push(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestValidParentheses soln = new LongestValidParentheses();
        String str = "((()())";
        int result = soln.longestValidParentheses(str);
        System.out.println(result);
    }
}
