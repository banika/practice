package leetcode.algo.array.easy;

public class UniquePaths {
    public int getUniquePaths(int n, int m) {
        int T[][] = new int[n][m];
        for (int i = 0; i < n; i++)
            T[i][0] = 1;
        for (int j = 0; j < m; j++)
            T[0][j] = 1;

        for(int i =1;i<n;i++)
            for(int j =1;j<m;j++)
                T[i][j]=T[i-1][j]+T[i][j-1];

        return T[n-1][m-1];
    }

    public static void main(String args[]){
        UniquePaths up = new UniquePaths();
        System.out.print(up.getUniquePaths(3,2));
        System.out.print(up.getUniquePaths(7,3));
    }
}
