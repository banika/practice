package leetcode.algo.array.easy;

import java.util.*;

/**
 * Created by banindita on 5/17/2017.
 */
public class TargetDiffPairs {
    public static void main(String[] args) {
        TargetDiffPairs diffPairs = new TargetDiffPairs();

        //int[] nums = {1, 3, 1, 5, 4,3}; int k =0;
        //int[] nums = {1,2,3,4,5}; int k =1;
        int[] nums = {3,1,4,1,5}; int k =2;
        //int[] nums = {1,2,3,4,5}; int k = -1;
        System.out.println(diffPairs.findPairs(nums,k));
    }

    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }

    public int findKdiffPairs(int[] nums, int k){
        if(k<0)
            return 0;
        Set<Pair> unique= new HashSet<Pair>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i =0;i<nums.length;i++) {
            if(k==0 && map.containsKey(nums[i])){
                unique.add(new Pair(nums[i],nums[i]));
            }
            map.put(nums[i], i + 1);
        }

        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i]+k) && k!=0){
                unique.add(new Pair(nums[i],nums[i]+k));
            }
        }
        return unique.size();
    }
    class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o){
            if(!(o instanceof Pair))
                return false;
            Pair p =(Pair)o;
            return (this.x==p.x && this.y==p.y) || (this.x==p.y && this.y==p.x);
        }

        @Override
        public int hashCode() {
            return x+y;
        }
    }
}
