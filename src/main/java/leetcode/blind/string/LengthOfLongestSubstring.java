package leetcode.blind.string;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0)
            return 0;
        int left = 0;
        int right = 0;
        int max = 0;

        Set<Character> set = new HashSet<>();
        while(right<s.length()){
            if(set.add(s.charAt(right))){
                right++;
                max = Math.max( max, right-left);
            }
            else{
                set.remove(s.charAt(left++));
            }
        }

        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        String str = "abcabcbb";
        int result = ls.lengthOfLongestSubstring(str);
        System.out.println(result);
    }

}
