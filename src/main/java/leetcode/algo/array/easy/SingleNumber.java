package leetcode.algo.array.easy;

/**
 * Created by banindita on 6/28/2017.
 */
public class SingleNumber {
    public static void main(String[] args) {
        /*
        for(int i=0;i<10;i++){
            System.out.println(~i);
        }
        */
        //System.out.println(~(-3));
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(singleNumber4(nums));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int num:nums){
            result ^=num;
        }
        return result;
    }

    /**
     * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i) & 1) == 1) {
                    sum++;
                    sum %= 3;
                }
            }
            if(sum != 0) {
                ans |= sum << i;
            }
        }
        return ans;
    }

    /**
     * Given an array of numbers nums, in which exactly two elements appear only once and
     * all the other elements appear exactly twice. Find the two elements that appear only once.
     * @param nums
     * @return
     */
    public static int[] singleNumber3(int[] nums) {
        // Pass 1 :
        // Get the XOR of the two numbers we need to find
        int diff = 0;
        for (int num : nums) {
            diff ^= num;
        }
        // Get its last set bit
        diff &= -diff;

        // Pass 2 :
        int[] rets = {0, 0}; // this array stores the two numbers we will return
        for (int num : nums)
        {
            if ((num & diff) == 0) // the bit is not set
            {
                rets[0] ^= num;
            }
            else // the bit is set
            {
                rets[1] ^= num;
            }
        }
        return rets;
    }

    public static int[] singleNumber4(int[] nums) {
        int diff = 0;
        for(int num:nums){
            diff ^= num;
        }
        diff &=-diff;

        int[] result = new int[2];
        for(int num:nums){
            if((num & diff)==0){
                result[0]^=num;
            }
            else{
                result[1]^=num;
            }
        }
        return result;
    }
}
