package leetcode.sf.easy;

public class BalancedBinaryTree {

     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         TreeNode(int x) {
             val = x;
         }

         public boolean isBalanced(TreeNode root) {
             if (root == null)
                 return true;
             if (Math.abs(height(root.left) - height((root.right))) <= 1)
                 return isBalanced(root.left) && isBalanced(root.right);
             return false;
         }


         public int height(TreeNode root) {
             if (root == null)
                 return 0;
             int left = height(root.left);
             int right = height(root.right);
             return Integer.max(left, right) + 1;
         }
     }
}
