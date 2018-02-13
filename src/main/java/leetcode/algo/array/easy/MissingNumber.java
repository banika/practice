package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/19/2017.
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(getMissingNumber(nums));
    }
    public static int getMissingNumber(int[] nums){
        int missingXor = nums[0];
        for(int i =1;i<nums.length;i++)
            missingXor^=nums[i];

        int notMissingXor = 0;
        for(int i =1;i<=nums.length;i++)
            notMissingXor^=i;
        return missingXor^notMissingXor;
    }
}
