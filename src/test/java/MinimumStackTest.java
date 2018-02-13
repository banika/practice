import org.junit.Assert;
import org.junit.Test;

/**
 * Created by banindita on 2/9/2017.
 */
public class MinimumStackTest {

    @Test
    public void testBasicStack(){
        MinimumStack minStack = new MinimumStack();
        minStack.push(5);
        minStack.push(4);
        minStack.push(1);
        minStack.push(8);
        int item = minStack.findMinimum();
        Assert.assertEquals(1,item);
        item = minStack.findMinimum();
    }
}
