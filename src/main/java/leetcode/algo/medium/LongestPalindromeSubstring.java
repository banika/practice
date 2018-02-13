package leetcode.algo.medium;

/**
 * Created by banindita on 2/12/2018.
 */
public class LongestPalindromeSubstring {

    public static void main(String[] args) {
        String input = "jklollolkidding";
        getLongestPalindrome(input);
    }

    public static String getLongestPalindrome(String input) {
        int length = input.length();
        boolean[][] strTable = new boolean[length][length];
        for(int i=0;i<length;i++)
            for(int j=0;j<length;i++)
                strTable[i][j]= false;

        //for length ==1
        for(int i=0;i<length;i++)
            strTable[i][i]= true;

        //length==2
        for(int i=0;i<length-1;i++)
            if(input.charAt(i)== input.charAt(i+1))
                strTable[i][i + 1] = true;
        

        return null;
    }

}
