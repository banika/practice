package leetcode.algo.array.easy;

import java.util.*;

/**
 * Created by banindita on 5/20/2017.
 */
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        for(int i =0; i< nums1.length; i++){
                map.put(nums1[i],1);
        }

        for(int i =0; i< nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                map.put(nums2[i], map.get(nums2[i])-1);
                result.add(nums2[i]);
            }
        }

        int[] resultArray = new int[result.size()];
        for(int i =0;i<result.size();i++)
            resultArray[i] = result.get(i);

        return resultArray;

    }
}
