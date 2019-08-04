package leetcodeasy;

public class RemoveDuplicates {

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = rd.removeDuplicates(nums);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums){
        int i =0;
        if(nums.length==0)
            return 0;
        for(int j =1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
