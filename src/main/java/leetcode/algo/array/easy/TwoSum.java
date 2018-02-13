package leetcode.algo.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by banindita on 5/17/2017.
 * For exactly one solution
 */
public class TwoSum {
    public static void main(String[] args) {
        int a[] = { 1, 2, 13, 34, 9, 3, 23, 45, 8, 7, 8, 3, 2 };
        int sum =11;
        System.out.println(Arrays.toString(twoSum(a,sum)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for(int i =0;i< nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
