package array;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        int left =1;
        for (int i = 0; i < n; i++) {
            res[i]=left;
            left *= nums[i];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }

    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        res[0] = 1;

        for(int i=0;i<n;i++){
            res[i]=left;
            left*=nums[i];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }


    public static void main(String[] args) {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        int[] array = {1,2,3,4};
        int[] result = productExceptSelf.productExceptSelf(array);
        System.out.println(result);
    }
}
