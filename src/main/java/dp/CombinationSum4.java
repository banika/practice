package dp;

import java.util.Arrays;

public class CombinationSum4 {

    private int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0]=1;
        return helper(nums, target);
    }

    public int helper(int[] nums, int target){
        if(dp[target]!=-1)
            return dp[target];

        int res = 0;
        for(int i=0; i<nums.length;i++){
            if(target>=nums[i]){
                res += helper(nums, target-nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }

    public static void main(String[] args) {
        int[] n = {1,2,3};
        int total = 4;
        CombinationSum4 cs = new CombinationSum4();
        int result = cs.combinationSum4(n,total);
        System.out.println(result);
    }
}
