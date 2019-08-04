package leetcode.sf.easy;

import java.util.Stack;

/**
 * Queue using stacks
 */
public class MyQueue {
    /** Initialize your data structure here. */
    public MyQueue() {

    }

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    int front = 0;
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.empty())
            front = x;
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.empty())
             while(!s1.empty())
                 s2.push(s1.pop());
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!s2.empty())
            return s2.peek();
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        queue.push(5);
        System.out.println(queue.pop());
    }
}
