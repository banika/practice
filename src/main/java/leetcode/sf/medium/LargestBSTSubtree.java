package leetcode.sf.medium;

public class LargestBSTSubtree {


     class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }


    public int largestBSTSubtree(TreeNode root) {
        int[] result = getLargestBSTSubtree(root);
        return result[2];
    }

    int[] getLargestBSTSubtree(TreeNode root){
         if(root == null)
             return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
         int[] leftTree = getLargestBSTSubtree(root.left);
         int[] rightTree = getLargestBSTSubtree(root.right);

         if(leftTree[1]< root.val && rightTree[0]>root.val)
             return new int[]{ Math.min(root.val, leftTree[0]), Math.max(rightTree[1], root.val), leftTree[2]+rightTree[2]+1};
         else
             return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(leftTree[2], rightTree[2])};
    }

}
