package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/17/2017.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(findInsertPosition(nums,7));
    }
    public static int findInsertPosition(int[] nums, int target){
        int low = 0; int high = nums.length-1; int mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid]>target)
                high = mid -1;
            else
                return mid;
        }
        return low;
    }
}
