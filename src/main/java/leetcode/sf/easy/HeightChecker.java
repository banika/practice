package leetcode.sf.easy;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedHeight = countSort(heights, 100);
        int result = 0;
        for(int i =0;i<heights.length;i++){
            if(sortedHeight[i]!=heights[i])
                result++;
        }
    return result;
    }


    int[] countSort(int[] a, int k){
        int[] c = new int[k];
        for(int i=0;i<a.length;i++)
            c[a[i]]++;
        for(int i=1;i<k;i++)
            c[i]+=c[i-1];
        int[] b = new int[a.length];

        for(int i=a.length-1;i>=0;i--)
            b[--c[a[i]]]=a[i];
        return b;
    }

    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int[] h = {1,1,4,2,1,3};
        int result = heightChecker.heightChecker(h);
        System.out.println(result);
    }
}
