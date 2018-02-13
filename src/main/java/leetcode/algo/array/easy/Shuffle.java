package leetcode.algo.array.easy;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by banindita on 6/4/2017.
 */
public class Shuffle {

    private int[] nums;
    Random random;
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Shuffle shuffle = new Shuffle(nums);
        System.out.println(Arrays.toString(shuffle.shuffle()));
    }

    public Shuffle(int[] nums){
        this.nums = nums;
        random = new Random();
    }

    public int[] shuffle(){
        int[] a = nums.clone();
        for(int j=1;j<nums.length;j++){
            int i = random.nextInt(j+1);
            swap(a, i,j);
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j]= temp;
    }
}
