package leetcode.algo.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by banindita on 6/5/2017.
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {2,2,1,3,5,5,6};
        System.out.println(Arrays.toString(removeDuplicate(nums)));
    }

    public String extractCteUsername(Map<String, Object> data) {
        		if (data == null) {
        			return "UNKNOWN_CTE_USERNAME";
        		}
        		Map<String, Object> ids = (Map<String, Object>) data.get("COM_CONCUR_INTERNAL_PRODUCT_IDENTIFIERS_1_0");
        		if (ids == null) {
            			return "UNKNOWN_CTE_USERNAME";
            		}
        		String cteUsername = (String) ids.get("cteUsername");
        		return (cteUsername == null) ? "UNKNOWN_CTE_USERNAME" : cteUsername;
        	}
    public static int[] removeDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i =0;
        int[] newArray = new int[set.size()];
        for(int num:set){
            newArray[i++] = num;
        }
        return newArray;
    }
}
