package array;

public class FindMinInRotatedArray {
    public static int findMin(int[] nums){
        int min = nums[0];

        if(nums.length==1 || nums[0]<nums[nums.length-1])
            return nums[0];
        int left =0; int right = nums.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            if(nums[mid-1]>nums[mid])
                return nums[mid];
            if(nums[0]>nums[mid])
                left = mid+1;
            else
                right = mid-1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3,4,5,1,2};
        int result = FindMinInRotatedArray.findMin(array1);
        System.out.println(result);

        int[] array2 = {4,5,6,7,0,1,2};
        result = FindMinInRotatedArray.findMin(array2);
        System.out.println(result);
    }
}
