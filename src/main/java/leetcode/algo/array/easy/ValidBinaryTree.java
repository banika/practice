package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 5/22/2017.
 */
public class ValidBinaryTree {

    /**
     * Definition for a binary tree node.*/
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    public static void main(String[] args) {
        ValidBinaryTree tree = new ValidBinaryTree();
        TreeNode treeNode = tree.new TreeNode(12);
        TreeNode left = tree.new TreeNode(2);
        TreeNode right = tree.new TreeNode(14);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode rightChild = tree.new TreeNode(145);
        treeNode.right.right = rightChild;

        System.out.println(tree.isValidBST(treeNode));
    }

    public boolean isValidBST(TreeNode root) {
        Long minVal = Long.MIN_VALUE;
        Long maxVal = Long.MAX_VALUE;
        return isValidBST(root, minVal, maxVal);
    }

    private boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if(root == null) return true;
        if(root.val<=minVal || root.val >= maxVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }

}
