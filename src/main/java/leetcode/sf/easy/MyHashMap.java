package leetcode.sf.easy;

public class MyHashMap {

    class ListNode{
        int key;
        int val;
        ListNode next;
        ListNode(int key, int val){
            this.key = key;
            this.val = val;
        }
    }

    ListNode[] nodes = new ListNode[10000];

    public void put(int key, int val){
        int i = idx(key);
        if(nodes[i]==null)
            nodes[i] = new ListNode(-1,-1);
        ListNode prev = find(nodes[i], key);
        if(prev.next==null)
            prev.next = new ListNode(key, val);
        else
            prev.next.val=val;
    }

    public int get(int key){
        int i = idx(key);
        if(nodes[i]==null)
            return -1;
        ListNode prev = find(nodes[i], key);

        return prev.next==null? -1: prev.next.val;
    }

    public void remove(int key){
        int i = idx(key);
        if(nodes[i]==null)
            return;
        ListNode prev = find(nodes[i], key);
        if(prev.next==null)
            return;
        else
            prev.next=prev.next.next;
    }

    public ListNode find(ListNode bucket, int key){
        ListNode node = bucket;
        ListNode prev = null;
        while(node!=null && node.key != key){
            prev = node;
            node = node.next;
        }
        return prev;
    }

    private int idx(int key){
        return Integer.hashCode(key)%nodes.length;
    }

    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(1,1);
        obj.put(2,2);
        int result = obj.get(1);
        System.out.println(result);

        result = obj.get(3);
        System.out.println(result);

        obj.put(2, 1);
        result = obj.get(2);
        System.out.println(result);

        obj.remove(2);
        result = obj.get(2);
        System.out.println(result);
    }
}
