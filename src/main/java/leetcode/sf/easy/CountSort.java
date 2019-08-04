package leetcode.sf.easy;

public class CountSort {

    int[] countSort(int[] a, int k){
        int[] c = new int[k];
        for(int i=0; i<a.length;i++)
            c[a[i]]++;

        for(int i =1;i<k;i++)
            c[i]+=c[i-1];

        int[] b = new int[a.length];

        for(int i=a.length-1;i>=0;i--)
            b[--c[a[i]]]=a[i];

        return b;
    }

}
