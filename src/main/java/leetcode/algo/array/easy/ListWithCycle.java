package leetcode.algo.array.easy;

/**
 * Created by banindita on 6/5/2017.
 */
class ListNode{
    int val;
    ListNode next;
    public ListNode(int x){
        val = x;
        next = null;
    }
}
public class ListWithCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head){
        if(head==null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while(runner.next!=null && runner.next.next!=null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}
