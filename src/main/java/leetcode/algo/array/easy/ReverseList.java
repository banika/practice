package leetcode.algo.array.easy;

/**
 * Created by banindita on 6/5/2017.
 */

public class ReverseList {
    public static void main(String[] args) {
        System.out.println();
    }
    public ListNode reverseIterative(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr =next;
        }
        return prev;
    }
}
