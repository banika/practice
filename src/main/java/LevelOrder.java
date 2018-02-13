import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Stack;

//Definition for binary tree
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

 class ListNode{
     int val;
     int depth;
     ListNode(int val, int depth){this.val=val; this.depth = depth;}
 }

public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
        return null;
    }
    public void createTree(){
        TreeNode root = new TreeNode(3);
        TreeNode rootLeft = new TreeNode(9);
        TreeNode rootRight = new TreeNode(20);
        root.left = rootLeft;
        root.right = rootRight;

        TreeNode left = new TreeNode(15);
        TreeNode right = new TreeNode(7);

        rootRight.left = left;
        rootRight.right = right;
    }

    public void traverse(TreeNode root){
        TreeNode node = root;
        ArrayList<ListNode> flatList = new ArrayList<ListNode>();
        flatList.add(new ListNode(root.val,1));
        while(node!=null){

        }
    }

    public void levelOrder1(TreeNode root){
        ArrayList<ArrayList<Integer>> parentList = new ArrayList<ArrayList<Integer>>();
        Stack stack = new Stack();
        stack.push(root.val);
        if(hasChildren(root)){
            ArrayList<Integer> childList = new ArrayList<Integer>();
            childList.add(root.val);
            stack.pop();
            childList = getChildrenList(root);
        }
    }

    private ArrayList<Integer> getChildrenList(TreeNode node) {
        ArrayList<Integer> childList = new ArrayList<Integer>();
        if(node.left!=null) {
            childList.add(node.left.val);
            //stack.push(root.left);
        }
        //if(node.right!=null) stack.push(root.right);
        return childList;
    }

    private boolean hasChildren(TreeNode root) {
        if(root.left!=null || root.right!=null)
            return true;
        return false;
    }
}
