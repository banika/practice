package mit.google.handnote;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by BAnindita on 6/23/2017.
 */
public class HasDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,5};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for(int num:nums){
            if(distinct.contains(num))
                return true;
            distinct.add(num);
        }
        return false;
    }
}
