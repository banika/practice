package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 5/22/2017.
 */
public class BinaryTreeMinimumDepth {

 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        BinaryTreeMinimumDepth tree = new BinaryTreeMinimumDepth();
        TreeNode treeNode = tree.new TreeNode(12);
        TreeNode left = tree.new TreeNode(2);
        TreeNode right = tree.new TreeNode(14);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode rightChild = tree.new TreeNode(145);
        treeNode.right.right = rightChild;
        int depth = tree.minDepth(treeNode);
        System.out.println(depth);
    }

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left==0 || right ==0)? left+right+1:Math.min(left,right)+1;
    }
}
