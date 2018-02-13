package leetcode.algo.array.easy;

import java.util.Stack;

/**
 * Created by BAnindita on 5/23/2017.
 */

public class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    /*
     * Definition for binary tree*/
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    private void pushAll(TreeNode node) {
        for(;node!=null; node = node.left)
            stack.push(node);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = stack.pop();
        pushAll(node.right);
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
