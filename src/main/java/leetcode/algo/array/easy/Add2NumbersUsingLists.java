package leetcode.algo.array.easy;

/**
 * Created by banindita on 5/19/2017.
 */
public class Add2NumbersUsingLists {
    public static void main(String[] args) {
        System.out.println();
        Add2NumbersUsingLists add = new Add2NumbersUsingLists();
        ListNode l1 = add.new ListNode<Integer>(8);
        ListNode node4 = add.new ListNode<Integer>(4);
        ListNode node3 = add.new ListNode<Integer>(9);
        l1.next = node4; node4.next = node3;

        ListNode l2 = add.new ListNode<Integer>(5);
        ListNode node6 = add.new ListNode<Integer>(6);
        ListNode node44 = add.new ListNode<Integer>(4);
        l2.next = node6; node6.next = node44;

        add.add2Numbers(l1,l2);
    }
    public  ListNode<Integer> add2Numbers(ListNode l1, ListNode l2){
        ListNode ln1 =l1, ln2=l2, head = null, node= null;
        head = node = new ListNode(0);
        int sum=0, carry=0, remainder = 0;
        while(ln1!=null || ln2!=null || carry != 0){
            sum = (ln1!=null?(Integer)ln1.data:0) + (ln2!=null?(Integer)ln2.data:0) + carry;
            carry = sum/10;
            remainder = sum%10;
            node = node.next = new ListNode(remainder);
            ln1 = (ln1!=null?ln1.next:null);
            ln2 = (ln2!=null?ln2.next:null);
        }
        return head.next;
    }

    public class ListNode<Item>{
        Item data;
        ListNode next;

        public ListNode(Item data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public ListNode(Item data){
            this(data,null);
        }
    }
}
