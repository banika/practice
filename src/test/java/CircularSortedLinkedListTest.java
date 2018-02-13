import org.junit.Assert;
import org.junit.Test;
/**
 * Created by banindita on 2/9/2017.
 */
public class CircularSortedLinkedListTest {
    @Test
    public void testBasics(){
        CircularSortedLinkedList list = new CircularSortedLinkedList();//5,8,10  2   8
        Node node = new Node(5);
        list.insert(node,node);

        Node node8 = new Node(8);
        list.insert(node,node8);

        Node node10 = new Node(10);
        list.insert(node,node10);

        Node node2 = new Node(2);
        list.insert(node8,node2);

        Node node1 = new Node(1);
        list.insert(node10,node1);

    }
}
