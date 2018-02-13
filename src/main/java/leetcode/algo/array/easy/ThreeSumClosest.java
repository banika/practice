package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/20/2017.
 */
public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {0,0,0};
        int target =1;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target){
        int closest = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int first=0;first<nums.length-2;first++){
            int second = first+1;
            int third = nums.length-1;
            while (second<third){
                int currSum = nums[first] + nums[second] + nums[third];
                if(currSum == target) return currSum;
                if(Math.abs(closest-target)> Math.abs(currSum- target)) closest = currSum;
                if(currSum < target) second ++;
                else third --;
            }
        }
        return closest;
    }
}
