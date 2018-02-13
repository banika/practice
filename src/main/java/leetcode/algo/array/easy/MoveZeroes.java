package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/17/2017.
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums){
        int insertPos =0;
        for(int num:nums){
            if(num!=0){
                nums[insertPos++]=num;
            }
        }
        while(insertPos<nums.length){
            nums[insertPos++]=0;
        }
    }
}
