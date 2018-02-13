package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by banindita on 5/18/2017.
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        //if(digits[digits.length-1]!=9){
          //  digits[digits.length-1]=digits[digits.length-1]+1;
            //return digits;
        //}
        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}
