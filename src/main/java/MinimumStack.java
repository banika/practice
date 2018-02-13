import java.util.Stack;

/**
 * Created by banindita on 2/9/2017.
 */
public class MinimumStack {
    Stack<Integer> inputStack;
    Stack<Integer> minStack;

    public MinimumStack() {
        inputStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    void push(Integer item) {
        inputStack.push(item);
        if (minStack.size() == 0) {
            minStack.push(item);
        } else if (item < minStack.peek()) {
            minStack.push(item);
        }
    }

    Integer findMinimum() {
        return minStack.pop();
    }

    Integer pop() {
        Integer item = inputStack.pop();
        if (item == minStack.peek()) {
            minStack.pop();
        }
        return item;
    }
}
