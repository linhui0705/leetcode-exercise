package P0933_NumberOfRecentCalls;

/**
 * Title: Solution2
 * Description:
 * 计算最近3000ms内ping的数量
 * 本题应该用队列来实现。这里用数组实现循环队列。
 *
 * @author Lin Hui
 * Created on 2020-1-14 12:38
 */
public class Solution2 {
    class RecentCounter {
        int[] arr;
        int front;
        int rear;

        public RecentCounter() {
            arr = new int[10000];
            front = 0;
            rear = -1;
        }

        public int ping(int t) {
            arr[++rear % 10000] = t;
            while (t - arr[front % 10000] > 3000) {
                front++;
            }
            return (rear - front + 1) % 10000;
        }
    }
}
