package P0933_NumberOfRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: Solution1
 * Description:
 * 计算最近3000ms内ping的数量
 * 本题应该用队列来实现。
 *
 * @author Lin Hui
 * Created on 2020-1-14 12:22
 */
public class Solution1 {
    class RecentCounter {
        Queue<Integer> queue;

        public RecentCounter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while (queue.size() > 0 && t - queue.peek() > 3000) {
                queue.remove();
            }
            return queue.size();
        }
    }
}
