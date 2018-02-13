package leetcode.algo.array.easy;

import java.util.Arrays;

/**
 * Created by banindita on 5/19/2017.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                            {1,2},
                            {3,4}
                         };
        transpose(matrix);
        reverseRows(matrix);
        System.out.println(Arrays.toString(matrix));
    }

    public static void transpose(int[][] matrix){
        int rows = matrix.length, cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            for(int j = i+1; j < cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverseRows(int[][] matrix){
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            reverse(matrix[i]);
        }
    }

    public static void reverse(int[] nums){
        for(int i = 0, j = nums.length-1; i<nums.length/2;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
