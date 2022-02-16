package P0142_LinkedListCycleII;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Solution1
 * Description:
 * 环形链表变形题。找到并返回链表开始入环的第一个节点，如果没有则返回null。
 * 快慢指针相遇时，让其中任一个指针指向头节点，然后让它俩以相同速度前进，再次相遇时所在的节点位置就是环开始的位置。
 * 详见：https://labuladong.gitee.io/algo/2/21/59/
 *
 * @author Lin Hui
 * Created on 2022/2/16 10:55:39
 */
public class Solution2 {
    @Test
    public void testCase() {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        // 首先找到快慢指针相遇的节点
        while (null != p && null != p.next) {
            q = q.next;
            p = p.next.next;
            if (p == q) {
                break;
            }
        }
        if (null == p || null == p.next) {
            return null;
        }
        // 将任意一个指针重置指向头节点，以相同的步伐前进。这时两指针相遇的节点即为链表开始入环的第一个节点。
        p = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
