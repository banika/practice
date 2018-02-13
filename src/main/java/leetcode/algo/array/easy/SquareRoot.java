package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/18/2017.
 */
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(findSqrt(6));
    }
    public static int findSqrt(int x){
        int left =1, right = x, mid, ans = 0;
        if(x==0) return 0;
        while(left<=right){
            mid = left + (right-left)/2;
            if(mid<= x/mid){
                left = mid+1;
                ans = mid;
            }else {
                right = mid -1;
            }
        }
        return ans;
    }
}
