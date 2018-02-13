package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/17/2017.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(rotateArray1(nums,1)));
        //rotateArray(nums,1);
        //System.out.println(Arrays.toString(nums));
    }
    public static void rotateArray(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order > arr.length){
            order = order %arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }

    public static int[] rotateArray1(int[] nums, int k){
        if(k>nums.length)
            k=k%nums.length;
        int a = nums.length - k;
        reverse(nums,0,a-1);
        reverse(nums,a,nums.length-1);
        reverse(nums,0,nums.length-1);
        return nums;
    }

    public static void reverse(int[] nums, int low, int high){
        if(nums == null || nums.length == 1)
            return;

        int temp;
        while(low<high){
            temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}
