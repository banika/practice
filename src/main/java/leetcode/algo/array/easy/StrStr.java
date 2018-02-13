package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/18/2017.
 */
public class StrStr {
    public static void main(String[] args) {
        //System.out.println(strstr("mississippi","issipi"));
        System.out.println(strstr("",""));
    }
    public static int strstr(String haystack, String needle){
        for(int i=0;;i++){
            for(int j=0;;j++){
                if(j==needle.length()) return i;
                if(i+j==haystack.length()) return -1;
                if(needle.charAt(j)!=haystack.charAt(i+j))break;
            }
        }
    }
}
