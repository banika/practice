package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/17/2017.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(getMaxConsecutiveOnes(nums));
    }
    public static int getMaxConsecutiveOnes(int[] nums){
        int count = 0;
        int maxSoFar = 0;
        for(int num:nums){
            if(num==1){
                count ++;
                maxSoFar = Math.max(maxSoFar,count);
            }
            else{
                count = 0;
            }
        }
        return maxSoFar;
    }
}
