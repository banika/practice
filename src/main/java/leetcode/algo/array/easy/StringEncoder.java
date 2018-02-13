package leetcode.algo.array.easy;

/**
 * Created by banindita on 6/1/2017.
 */
public class StringEncoder {
    public static void main(String[] args) {
        StringEncoder encoder = new StringEncoder();
        String ans = encoder.encode("aaabbb222");
        //assert encoder.encode("abbbbaa").equals("a1b4a2");
        System.out.println(encoder.encode("aaabbb222"));
    }
    public String encode(String source){
        StringBuilder ans=new StringBuilder();
        ans.append(source.charAt(0));
        char cur = source.charAt(0);
        int count = 1;
        for(int i=1;i<source.length();i++){
            if(cur==source.charAt(i)){
                count++;
            }
            else{
                ans.append(count);
                ans.append(source.charAt(i));
                cur = source.charAt(i);
                count = 1;
            }
        }
        ans.append(count);
        return ans.toString();
    }
}
