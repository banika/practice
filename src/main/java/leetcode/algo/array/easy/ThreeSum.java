package leetcode.algo.array.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by banindita on 6/5/2017.
 */
public class ThreeSum {
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {1,1,3,5,0,0,2,1,2,1,0,1};
        System.out.println(threeSum.threeSum(nums,5));
    }

    public List<List<Integer>> threeSum(int[] num, int target){
        Arrays.sort(num);
        List<List<Integer>> result = new LinkedList<>();
        for(int i =0;i<num.length-2;i++){
            if(i==0 ||(i>0 && num[i]!=num[i-1] )){
                int lo = i+1, hi = num.length-1, sum = target-num[i];
                while(lo<hi){
                    if(num[lo]+num[hi]==sum) {
                        result.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo<hi && num[lo]==num[lo+1]) lo++;
                        while (lo<hi && num[hi]==num[hi-1]) hi++;
                        lo++;hi--;
                    }
                    else if(num[lo]+num[hi]<sum) lo++;
                    else hi--;
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i =0;i<nums.length-2;i++){
            if(i ==0 || (i>0 && nums[i]!=nums[i-1])){
                int lo = i+1, hi = nums.length-1, sum = 0-nums[i];
                while(lo<hi){
                    if(nums[lo]+nums[hi]==sum){
                        result.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
                        while(lo<hi && nums[lo]==nums[lo+1]) lo++;
                        while(lo<hi && nums[hi]==nums[hi-1]) hi--;
                        lo++; hi--;
                    }
                    else if(nums[lo]+nums[hi]<sum)lo++;
                    else hi --;
                }
            }
        }
        return result;
    }
}
