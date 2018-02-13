package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/19/2017.
 */
public class ThirdMax {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int getThirdMax(int[] nums){
        Integer max3 = null, max2 = null, max1 =null;
        for(Integer num:nums){
            if(num.equals(max3) || num.equals(max2) || num.equals(max1)) continue;
            if(max1==null || num > max1){
                max3=max2;
                max2=max1;
                max1=num;
            }
            else if(max2==null || num > max2){
                max3=max2;
                max2=num;
            }
            else if(max3==null || num > max3){
                max3 = num;
            }
        }
        return max3==null? max1:max3;
    }
}
