package leetcode.algo.array.easy;

import java.util.Stack;

/**
 * Created by BAnindita on 5/23/2017.
 */
public class Histogram {
    public static void main(String[] args) {
        Histogram histogram = new Histogram();
        int[] heights = {2,1,5,6,2,3};
        System.out.println(histogram.largestRectangleArea(heights));
    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i =0;i<=len;i++){
            int h = (i==len)?0:heights[i];
            if(stack.isEmpty() || h>=heights[stack.peek()])
                stack.push(i);
            else{
                int top = stack.pop();
                maxArea = Math.max(maxArea, heights[top]* (stack.isEmpty()?i:i-1-stack.peek()));
                i--;
            }
        }
        return maxArea;
    }
}
