package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by BAnindita on 5/22/2017.
 */
public class BacktrackSubset {
    public static void main(String[] args) {
        BacktrackSubset subset = new BacktrackSubset();
        int[] nums = {1,2,2};
        System.out.println(subset.subsets(nums));
        System.out.println(subset.subsetsWithDup(nums));

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            //System.out.println("templist size:"+tempList.size());
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrackWithDup(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    private void backtrackWithDup(List<List<Integer>> list, ArrayList<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip set duplicates
            tempList.add(nums[i]);
            System.out.println(tempList);
            backtrackWithDup(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
