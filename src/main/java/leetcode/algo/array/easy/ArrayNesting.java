package leetcode.algo.array.easy;

import java.util.*;

/**
 * Created by BAnindita on 6/13/2017.
 */
public class ArrayNesting {
    public static void main(String[] args) {
        int[] nums = {0,2,1};//{5,4,0,3,1,6,2};
        System.out.println(arrayNesting(nums));
    }

    public static int arrayNesting1(int[] a) {
        int maxsize = 0;
        for (int i = 0; i < a.length; i++) {
            int size = 0;
            for (int k = i; a[k] >= 0; size++) {
                int ak = a[k];
                a[k] = -1; // mark a[k] as visited;
                k = ak;
            }
            maxsize = Integer.max(maxsize, size);
        }

        return maxsize;
    }

    public static int arrayNesting2(int[] a) {
        int maxsize = 0;
        for (int i = 0; i < a.length; i++) {
            int size = 0;
            for (int k = i; a[k] >= 0; size++) {
                int ak = a[k];
                a[k] = -1;
                k = ak;
            }
            maxsize = Integer.max(maxsize, size);
        }

        return maxsize;
    }
    public static int arrayNesting(int[] nums) {
        Map<Integer, Integer> numSet = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            numSet.put(i,nums[i]);
        }
        int maxSoFar =0, prevNum=0;
        for(int i =0;i<nums.length;i++){
            Set<Integer> list = new HashSet<>();
            for(int j = i;j<nums.length;j++){
                if(j==i) prevNum = j;
                if(!numSet.containsKey(nums[prevNum])) break;
                list.add(nums[prevNum]);
                prevNum = nums[prevNum];
            }
            if(list.size()>maxSoFar){
                maxSoFar = list.size();
            }
        }
        return maxSoFar;
    }
}
