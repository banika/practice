package leetcode.algo.array.easy;

/**
 * Created by banindita on 6/5/2017.
 * The programming question consisted of writing a program to sum up the elements in an array
 * that are divisible by two numbers given. So let's say you have an array [1, 2, 3, ... 10]. Then given two numbers, say 3 and 5,
 * you want to sum up the numbers divisible by 3 or 5 in that array and return the…
 */
public class DivisibleByTarget {
    public static void main(String[] args) {
        DivisibleByTarget target = new DivisibleByTarget();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(target.getResult(nums,3,5));
    }

    public int getResult(int[] nums, int a, int b){
        int result = 0;
        for(int i =0;i< nums.length;i++){
            if(nums[i]%a==0 || nums[i]%b==0)
                result+=nums[i];
        }
        return result;
    }
}
