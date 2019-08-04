package leetcode.sf.hard;

import java.util.PriorityQueue;

public class MergekSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(ListNode head: lists){
            while(head!=null){
                minHeap.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head= head.next;
        }

        return dummy.next;
    }
}


 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
