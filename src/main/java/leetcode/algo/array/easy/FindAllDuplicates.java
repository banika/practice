package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by banindita on 5/17/2017.
 */
public class FindAllDuplicates {
    public static void main(String[] args) {
        //printRepeating(new int[]{4,3,2,7,8,2,3,1});
        int[] nums = {10,2,5,10,9,1,1,4,3,7};
        System.out.println(findDuplicates(nums));
        //System.out.println();
    }
    static void printRepeating(int arr[])
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < arr.length; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> dupList = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;
            if(nums[index]<0){
                dupList.add(Math.abs(nums[i]));
            }
            else{
                nums[index]=-nums[index];
            }
        }
        return dupList;
    }
}
