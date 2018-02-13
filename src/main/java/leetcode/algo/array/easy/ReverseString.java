package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/20/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("HELLO"));
    }

    public static String reverseString(String s){
        char[] sArray = s.toCharArray();
        for(int i =0,j=s.length()-1;i<s.length()/2;i++,j--){
            char temp = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = temp;
        }
        return new String(sArray);
    }
}
