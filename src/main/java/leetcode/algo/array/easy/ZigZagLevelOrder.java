package leetcode.algo.array.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by BAnindita on 5/24/2017.
 */
public class ZigZagLevelOrder {

    /**
     * Definition for a binary tree node.*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        ZigZagLevelOrder tree = new ZigZagLevelOrder();
        TreeNode treeNode = tree.new TreeNode(3);
        TreeNode left = tree.new TreeNode(9);
        TreeNode right = tree.new TreeNode(20);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode rightleftChild = tree.new TreeNode(15);
        treeNode.right.left = rightleftChild;
        TreeNode rightrightChild = tree.new TreeNode(7);
        treeNode.right.right = rightrightChild;
        tree.zigzagLevelOrder(treeNode);
        System.out.println();
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
    {
        List<List<Integer>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(TreeNode curr, List<List<Integer>> sol, int level)
    {
        if(curr == null) return;

        if(sol.size() <= level)
        {
            List<Integer> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }

        List<Integer> collection  = sol.get(level);
        if(level % 2 == 0) collection.add(curr.val);
        else collection.add(0, curr.val);

        travel(curr.left, sol, level + 1);
        travel(curr.right, sol, level + 1);
    }
}
