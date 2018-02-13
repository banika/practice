package leetcode.algo.array.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by BAnindita on 6/23/2017.
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        System.out.println(containsNearbyDuplicate1(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int pointer = map.get(nums[i]);
                map.put(nums[i],i);
                if(Math.abs(Math.subtractExact(pointer,i))<=k)
                    return true;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
