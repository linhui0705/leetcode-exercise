package P0225_ImplementStackUsingQueues;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Title: MyStack
 * Description:
 * 用队列实现栈
 *
 * @author Lin Hui
 * Created on 2019/2/25 14:22
 */
public class MyStack {
    Queue<Integer> queue;
    int peek = 0;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queue = new PriorityQueue<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.add(x);
        peek = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        Queue<Integer> tmp = new PriorityQueue<>();
        while (queue.size() > 1) {
            peek = queue.poll();
            tmp.add(peek);
        }
        int top = queue.poll();
        queue = tmp;
        return top;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return peek;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}