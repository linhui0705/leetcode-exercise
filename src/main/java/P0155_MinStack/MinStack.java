package P0155_MinStack;

import java.util.Stack;

/**
 * Title: MinStack
 * Description:
 * 设计一个栈，除了有栈本身的功能，还要能输出当前栈的最小元素值
 *
 * @author Lin Hui
 * Created on 2019-12-27 20:31
 */
public class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack();
    }

    public void push(int x) {
        if (min >= x) {
            min = x;
            minStack.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.peek().intValue() == minStack.peek().intValue()) {
            minStack.pop();
        }
        stack.pop();
        if (minStack.size() != 0) {
            min = minStack.peek();
        } else {
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}