package array;

public class MaxSubarrayProduct {
    public static int maxProduct(int[] nums) {
        int r = nums[0]; int tmp=0;

        for(int i =1, imax=r, imin=r;i<nums.length;i++){
            tmp = imax;
            imax = Math.max( Math.max(imax*nums[i], imin*nums[i]), nums[i]);
            imin = Math.min( Math.min(imax*nums[i], imin*nums[i]), nums[i]);
            r = Math.max(imax,r);
        }
        return r;
    }


    public static void main(String[] args) {
        int[] array1 = {2,3,-2,4};
        int result = MaxSubarrayProduct.maxProduct(array1);
        System.out.println(result);

        int[] array2 = {-2,0,-1};
        result = MaxSubarrayProduct.maxProduct(array2);
        System.out.println(result);
    }

}
