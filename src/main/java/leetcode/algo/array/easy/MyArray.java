package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 4/25/2017.
 */
public class MyArray {

    public static void main(String[] args){
        int[] inputArray = {2,2,3,3,4};
        //int min = findMinInRotatedSortedArray(inputArray);
        int length = removeDuplicate1(inputArray);
        //int first = firstBadVersion(8);
    }

    public static int firstBadVersion(int n) {
        int low=1, high = n, mid=0;
        while(low<high){
            mid = low + (high-low)/2;
            if(isBadVersion(mid)){
               high =mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    static boolean isBadVersion(int version){
        if(version >=3)
            return true;
        else
            return false;
    }

    static int removeDuplicate(int[] nums){
        int id =1;
        if(nums.length<2)
            return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[id++]=nums[i];
            }
        }
        return id;
    }

    static int removeDuplicate1(int[] nums){
        int id =1;
        int counter =1;
        if(nums.length<2)
            return 1;
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            if(nums[i]!=nums[j])
                counter ++;
        }
        return counter;
    }
    public static int findMinInRotatedSortedArray(int[] nums){
        int low=0, high = nums.length-1, mid=0;
        while(low<high){
            if(nums[low] < nums[high])
                return nums[low];
            mid = (low+high)/2;
            if(nums[mid]>=nums[low]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }

    static int findMin(int[] num) {
        int start=0,end=num.length-1;

        while (start<end) {
            if (num[start]<num[end])
                return num[start];

            int mid = (start+end)/2;

            if (num[mid]>=num[start]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }

        return num[start];
    }
}
