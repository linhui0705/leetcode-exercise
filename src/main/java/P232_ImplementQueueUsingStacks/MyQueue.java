package P232_ImplementQueueUsingStacks;

import java.util.Stack;

/**
 * Title: MyQueue
 * Description:
 * 用栈实现队列
 *
 * @author Lin Hui
 * Created on 2019/2/25 14:02
 */
class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int pop = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return pop;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int pop = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return pop;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty();
    }
}