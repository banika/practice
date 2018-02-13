package leetcode.algo.array.easy;

/**
 * Created by BAnindita on 5/22/2017.
 */
public class LowestCommonAncestor {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        TreeNode treeNode = tree.new TreeNode(12);
        TreeNode left = tree.new TreeNode(2);
        TreeNode right = tree.new TreeNode(14);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode rightChild = tree.new TreeNode(145);
        treeNode.right.right = rightChild;

        System.out.println(tree.lowestCommonAncestor(treeNode, left, right.right).val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val > q.val) return lowestCommonAncestor(root.left, p,q);
        else if(root.val<p.val && root.val < q.val) return lowestCommonAncestor(root.right, p,q);
        else return root;
    }
}
