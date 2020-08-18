package dp;

public class PalindromicSubstring {

    public int palindromicSubstring(String s) {
        int[][] matrix = new int[s.length()][s.length()];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            matrix[i][i] = 1;
            count++;
        }
        char[] charArray = s.toCharArray();
        for (int col = 1; col < s.length(); col++)
            for (int row = 0; row < col; row++) {
                if (row == col - 1 && charArray[row] == charArray[col]) {
                    matrix[row][col] = 1;
                    count++;
                } else if (matrix[row + 1][col - 1] == 1 && charArray[row] == charArray[col]) {
                    count++;
                }
            }
        return count;
    }
}
