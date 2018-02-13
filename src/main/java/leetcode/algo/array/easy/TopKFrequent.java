package leetcode.algo.array.easy;

import java.util.*;

/**
 * Created by BAnindita on 6/15/2017.
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums =  {1,2};
        System.out.println(topKFrequent(nums, 2));
    }

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        SortedMap<Integer, Integer> reverseMap = new TreeMap<>();
        for(int i =0;i<nums.length;i++) {
            int newVal = nums[i];
            int newKey = map.get(nums[i]);
            reverseMap.put(newKey, newVal);
        }

        List<Integer> list = new ArrayList<>();
        for(int i =0; i<k;i++){
            int key = reverseMap.lastKey();
            int val = reverseMap.get(key);
            reverseMap.remove(key);
            list.add(val);
        }

        return list;
    }
}
