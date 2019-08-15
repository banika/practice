package leetcode.blind.string;

//https://medium.com/@bhprtk/longest-palindromic-substring-a8190fab03ff

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1)
            return s;
        String longest = s.substring(0, 1);
        for(int i = 0; i < s.length(); i++) {
            String temp = extendPalindrome(s, i, i);
            if(temp.length() > longest.length()) {
                longest = temp;
            }
            temp = extendPalindrome(s, i, i + 1);
            if(temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    private String extendPalindrome(String s, int begin, int end) {
        while(begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }



    public static void main(String[] args) {
        String s = "babad";
        LongestPalindrome longest = new LongestPalindrome();
        String result = longest.longestPalindrome(s);
        System.out.println(result);
    }
}
