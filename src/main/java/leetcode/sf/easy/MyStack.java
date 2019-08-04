package leetcode.sf.easy;

import java.util.LinkedList;

class MyStack {

    /** Initialize your data structure here. */
    public MyStack() {

    }

    LinkedList<Integer> q = new LinkedList<>();
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size>1){
            q.add(q.remove());
            size--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.remove();
    }

    /** Get the top element. */
    public int top() {
        return q.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(3);
        System.out.println(stack.pop());
    }
}
