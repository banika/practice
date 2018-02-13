package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BAnindita on 5/24/2017.
 */
public class GenerateParentheses {

    public static void main(String[] args) {
        GenerateParentheses parentheses = new GenerateParentheses();
        System.out.println(parentheses.generateParenthesis(3));
        System.out.println(parentheses.generateParenthesis1(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list,"",0,0,n);
        return list;
    }

    public List<String> generateParenthesis1(int n) {
        List<String> list = new ArrayList<>();
        backtrack1(list,"",0,0,n);
        return list;
    }

    private void backtrack1(List<String> list, String str, int open, int close, int max) {
        if(str.length()==2*max) {
            list.add(str);
            return;
        }
        if(open<max)
            backtrack1(list,str+"(",open+1,close,max);
        if(close<open)
            backtrack1(list,str+")",open,close+1,max);
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            list.add(str);
            return;
        }

        if(open < max)
            backtrack(list, str+"(", open+1, close, max);
        if(close < open)
            backtrack(list, str+")", open, close+1, max);
    }

}