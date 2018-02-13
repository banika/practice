package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by BAnindita on 10/6/2017.
 */
public class FindInRotatedSortedArray {
    public static void main(String[] args) {
        HashMap hm = new HashMap<String, String>();
        hm.put("Anindita","Kabyo");
        hm.put("Anindita","Kotha");
        System.out.println(hm.get("Anindita"));
        hm.remove("Anindita");
        System.out.println(hm.get("Anindita"));
        FindInRotatedSortedArray array = new FindInRotatedSortedArray();
        int[] arr = {4,5,1,2,3};
        System.out.println(array.findInRotatedSortedArray(arr,4));
    }

    public int findInRotatedSortedArray(int A[], int key) {
        int L = 0;
        int N = A.length;
        int R = N - 1;

        while (L <= R) {
            // Avoid overflow, same as M=(L+R)/2
            int M = L + ((R - L) / 2);
            if (A[M] == key) return M;

            // the bottom half is sorted
            if (A[L] <= A[M]) {
                if (A[L] <= key && key < A[M])
                    R = M - 1;
                else
                    L = M + 1;
            }
            // the upper half is sorted
            else {
                if (A[M] < key && key <= A[R])
                    L = M + 1;
                else
                    R = M - 1;
            }
        }
        return -1;
    }
}
