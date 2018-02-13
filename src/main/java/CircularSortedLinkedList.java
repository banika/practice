/**
 * Created by banindita on 2/9/2017.
 */

class Node{
    int value;
    Node next;

    public Node(int data){
        this.value=data;
        next = null;
    }
}
public class CircularSortedLinkedList {
    public void insert(Node node, Node newNode) {
        if(node.next==null){
            node.next =node;
        }
        if(node==newNode){
            return;
        }
        int newData = newNode.value;
        Node startNode = node;
        if(node.value < newData){
            if(node.next!=node){
                while(node.next.value < newData && node.next!=startNode){
                    node = node.next;
                }
                Node prevNextNode = node.next;
                node.next = newNode;
                newNode.next = prevNextNode;
            }
            else{
                node.next = newNode;
                newNode.next = node;
            }
        }
        else{
            while(node.value < node.next.value){
                node = node.next;
            }
            if(node.next.value>newData){
                newNode.next=node.next;
                node.next=newNode;
            }
        }
    }

}
