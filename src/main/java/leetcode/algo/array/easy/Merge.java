package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/18/2017.
 */
public class Merge {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {2,4,6,8};
        System.out.println(Arrays.toString(merge(nums1,0, nums2,4)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                nums[k++] = nums1[i++];
            }
            else{
                nums[k++] = nums2[j++];
            }
        }
        while(i<m){
            nums[k++] = nums1[i++];
        }
        while(j<n){
            nums[k++] = nums2[j++];
        }
        return nums;
    }
}
