package leetcode.algo.array.easy;

import java.util.ArrayList;

/**
 * Created by BAnindita on 5/25/2017.
 */
public class WaterContainer {
    public static void main(String[] args) {
        int nums[] = {1, 1};
        WaterContainer container = new WaterContainer();
        System.out.println(container.containWater(nums));
    }
    public int containWater(int[] heights){
        int maxArea = 0;
        int left = 0; int right = heights.length-1;
        while(left<right){
            maxArea = Math.max(maxArea, (Math.min(heights[right],heights[left])*(right-left)));
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return maxArea;
    }
    public int maxArea(ArrayList<Integer> height) {
        int maxArea = 0;
        int left = 0; int right = height.size()-1;
        while(left<right){
            maxArea = Math.max(maxArea, (Math.min(height.get(left), height.get(right))*(right-left)));
            if(height.get(left)< height.get(right)) left ++;
            else right --;
        }
        return maxArea;
    }
}

