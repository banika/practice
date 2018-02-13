package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/17/2017.
 */
public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(getMajorityElement(new int[]{1,0,1,0,1}));
    }

    static int getMajorityElement(int[] nums){
        int major = nums[0];
        int count =1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                major = nums[i];
                count++;
            }
            else if(nums[i]==major)
                count++;
            else
                count--;

        }
        return major;
    }
}
