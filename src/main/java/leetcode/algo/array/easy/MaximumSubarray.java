package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/18/2017.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-1};//{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubarray(nums));
    }
    public static int findMaxSubarray(int[] nums){
        int maxSoFar = nums[0]; int maxEndingHere = nums[0];
        for(int i=1;i<nums.length;i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
}
