package array;

public class MaxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int maxSoFar=nums[0];
        int maxEndingHere = nums[0];
        for(int i =1;i<nums.length;i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int result = MaxSubarraySum.maxSubArray(array);
        System.out.println(result);
    }

}
