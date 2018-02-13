package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by BAnindita on 5/23/2017.
 * https://discuss.leetcode.com/topic/46161/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/2
 */
public class BacktrackCombinationSum {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7};
        BacktrackCombinationSum backtrack = new BacktrackCombinationSum();
        System.out.println(backtrack.combinationSum(nums,7));
        System.out.println(backtrack.combinationSumWithoutDup(nums,7));

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int remain, int start) {
        if(remain<0)return;
        else if(remain==0) list.add(new ArrayList<Integer>(tempList));
        else{
            for(int i=start; i<nums.length;i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain-nums[i], i);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSumWithoutDup(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrackWithoutDup(list, new ArrayList<Integer>(), candidates, target, 0);
        return list;
    }

    private void backtrackWithoutDup(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int remain, int start) {
        if(remain<0)return;
        else if(remain==0) list.add(new ArrayList<Integer>(tempList));
        else{
            for(int i=start; i<nums.length;i++){
                if(i>start && nums[i]==nums[i-1]) continue;
                tempList.add(nums[i]);
                backtrackWithoutDup(list, tempList, nums, remain-nums[i], i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
