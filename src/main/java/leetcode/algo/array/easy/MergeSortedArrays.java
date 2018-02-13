package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/19/2017.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1, nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k = m+n-1;
        while(i >=0  && j >= 0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}
