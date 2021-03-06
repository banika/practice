package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BAnindita on 5/23/2017.
 */
public class PalindromePartition {
    public static void main(String[] args) {
        String s = "aab";
        PalindromePartition solution = new PalindromePartition();
        System.out.println(solution.partition(s));
    }

    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        backtrack(list, new ArrayList<String>(), s, 0);
        return list;
    }

    private void backtrack(List<List<String>> list, ArrayList<String> tempList, String s, int start) {
        if(start == s.length()) list.add(new ArrayList<String>(tempList));
        else{
            for(int i= start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    tempList.add(s.substring(start,i+1));
                    backtrack(list, tempList, s, i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

    private boolean isPalindrome(String s, int low, int high) {
        while(low<high){
            if(s.charAt(low++)!=s.charAt(high--)) return false;
        }
        return true;
    }
}
