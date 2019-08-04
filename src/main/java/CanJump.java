public class CanJump {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max)
                return false;
            max=Math.max(nums[i]+i, max);
        }
        return true;
    }

    public static void main(String[] args) {
        CanJump jumper = new CanJump();
        int[] nums = {3,0};
        boolean result = jumper.canJump(nums);
        System.out.println(result);
    }
}
