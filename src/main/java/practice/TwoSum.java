package practice;

import java.util.Hashtable;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(table.get(nums[i])!=null)
                return new int[]{table.get(nums[i]),i};
            else
                table.put(target-nums[i],i);
        }
    return new int[]{};
    }

    private void changeValue(String q){
        q="xyz;";
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        TwoSum sum = new TwoSum();
        String str = "abc";
        sum.changeValue(str);
        System.out.println(str);

        int[] result = sum.twoSum(nums,target);
        System.out.println(result);
    }
}
