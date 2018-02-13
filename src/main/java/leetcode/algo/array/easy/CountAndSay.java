package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by banindita on 6/1/2017.
 */
public class CountAndSay {
    public static void main(String[] args) {
        String n = "31131211131221";
        //System.out.println(generateNth(n));
        System.out.println(countAndSay(10));
    }

    public static String countAndSay(int n) {
        List<String> list = new ArrayList<>();
        list.add(0, "1");
        for(int i=1;i<n;i++){
            list.add(i,generateNth(list.get(i-1)));
        }
        return list.get(n-1);
    }

    public static String generateNth(String source){
        int counter = 1;
        StringBuilder ans = new StringBuilder();
        char curr = source.charAt(0);
        for(int i =1;i<source.length();i++){
            if(curr==source.charAt(i)){
                counter++;
            }
            else{
                ans.append(counter);
                ans.append(curr);
                curr = source.charAt(i);
                counter = 1;
            }
        }
        ans.append(counter);
        ans.append(curr);
        return ans.toString();
    }
}
