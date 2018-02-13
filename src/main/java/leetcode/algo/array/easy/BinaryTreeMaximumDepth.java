package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 5/22/2017.
 */
public class BinaryTreeMaximumDepth {

 public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        BinaryTreeMaximumDepth tree = new BinaryTreeMaximumDepth();
        tree.IsUseEntityLocation("");
        TreeNode treeNode = tree.new TreeNode(12);
        TreeNode left = tree.new TreeNode(2);
        TreeNode right = tree.new TreeNode(14);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode rightChild = tree.new TreeNode(145);
        treeNode.right.right = rightChild;
        int depth = tree.maxDepth(treeNode);
        System.out.println(depth);
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (left==0 || right ==0)? left+right+1:Math.max(left,right)+1;
    }

    public boolean IsUseEntityLocation(String entityCode)
    {
        boolean useEntityLocation = false;

        try
        {
            String a = null;
            System.out.println(a.toString());
        }
        catch (Exception ex)
        {
            System.out.println();
            throw ex;
        }

        return useEntityLocation;
    }
}
